CREATE TABLE 'user_details' (
    'id' int(11) NOT NULL AUTO_INCREMENT,
    'user_id' char(36) NOT NULL,
    'first_name' varchar(250) NOT NULL,
    'middle_name' varchar(250) DEFAULT NULL,
    'last_name' varchar(250) DEFAULT NULL,
    'created_on' TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    'deleted_on' TIMESTAMP DEFAULT NULL,
    'leagal_id' varchar(10) NOT NULL,
    'date_of_birth' TIMESTAMP NOT NULL,
    'gender' int(11) NOT NULL,
    PRIMARY KEY ('id'),
    KEY 'user_id' ('user_id'),
    KEY 
)