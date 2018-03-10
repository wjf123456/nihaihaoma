create table  user(
   id Int not null  PRIMARY KEY AUTO_INCREMENT
  ,email VARCHAR (64) not null
  ,pwd VARCHAR(60) not NULL
  ,count int
  ,last_login_time TIMESTAMP
);

CREATE TABLE log(
   id Int not NULL  PRIMARY KEY AUTO_INCREMENT
  ,login_time TIMESTAMP
  ,user_Id Int
);

alter table log add constraint fk_id foreign key(user_Id)
references user(id);

INSERT INTO user(email, pwd, count, last_login_time)
VALUES ('87356511@qq.com','123456',2,'2017-5-12')