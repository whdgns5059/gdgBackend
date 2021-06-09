DROP TABLE IF EXISTS USERS;
DROP TABLE IF EXISTS POSTS;

CREATE TABLE users (
       id bigint NOT NULL auto_increment,
       email varchar(50) NOT NULL,
       password varchar(50) NOT NULL,
       PRIMARY KEY (id),
       CONSTRAINT unq_user_email UNIQUE(email)
);

CREATE TABLE posts(
    id bigint NOT NULL auto_increment,
    title varchar(100) NOT NULL,
    content varchar(2000) NOT NULL,
    writer bigint NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO USERS(email, password) values ('asdf@asdf.or.kr', 'asdf');
INSERT INTO USERS(email, password) values ('qwer@qwer.or.kr', 'qwer');
INSERT INTO USERS(email, password) values ('zxcv@zxcv.or.kr', 'zxcv');
INSERT INTO USERS(email, password) values ('fdas@fdsa.or.kr', 'fdas');

INSERT INTO posts(title, content, writer) values ('제목1', '내용1', 1);
INSERT INTO posts(title, content, writer) values ('제목2', '내용2', 1);
INSERT INTO posts(title, content, writer) values ('제목3', '내용3', 2);
INSERT INTO posts(title, content, writer) values ('제목4', '내용4', 3);