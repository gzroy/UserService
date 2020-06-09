package com.roy.microservices.userservice;
import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;
	@Value("${Connect.database}")
	private String database;

	@Bean(initMethod="migrate")
	public Flyway flyway() {
		String urlWithoutDatabaseName = url.substring(0, url.lastIndexOf("/"));
		Flyway flyway = new Flyway();
		flyway.setDataSource(urlWithoutDatabaseName, username, password);
		flyway.setSchemas(database);
		flyway.setBaselineOnMigrate(true);
		return flyway;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
