DROP TABLE IF EXISTS USERS;

CREATE TABLE users (
       id bigint NOT NULL auto_increment,
       email varchar(50) NOT NULL,
       password varchar(50) NOT NULL,
       PRIMARY KEY (id),
       CONSTRAINT unq_user_email UNIQUE(email)
);

INSERT INTO USERS(email, password) values ('asdf@asdf.or.kr', 'asdf');
INSERT INTO USERS(email, password) values ('qwer@qwer.or.kr', 'qwer');
INSERT INTO USERS(email, password) values ('zxcv@zxcv.or.kr', 'zxcv');
INSERT INTO USERS(email, password) values ('fdas@fdsa.or.kr', 'fdas');