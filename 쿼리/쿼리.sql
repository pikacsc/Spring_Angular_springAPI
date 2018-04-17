use mydb;

CREATE TABLE user
(
	name  VARCHAR(255) not null,
    id VARCHAR(255) PRIMARY KEY,
    pwd VARCHAR(20) not null,
    email VARCHAR(255) not null
)ENGINE=InnoDB;


commit;

select * from user;
