CREATE TABLE board (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    content varchar(500) NOT NULL
);
--SELECT * FROM BOARD

--insert into board(id,title,content)values (1,'두번째입니다','감사합니다');
--insert into board(id,title,content)values (2,'세번째입니다','감사합니다');
--insert into board(id,title,content)values (3,'네번째입니다','감사합니다');