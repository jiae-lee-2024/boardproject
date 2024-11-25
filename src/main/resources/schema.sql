-- 게시판 테이블
CREATE TABLE board (
    id BIGINT AUTO_INCREMENT PRIMARY KEY, -- 게시글 ID
    title VARCHAR(255) NOT NULL,          -- 제목
    content VARCHAR(500) NOT NULL         -- 내용
);

-- 댓글 테이블
CREATE TABLE comments (
    comment_id BIGINT AUTO_INCREMENT PRIMARY KEY, -- 댓글 ID
    board_id BIGINT NOT NULL,                      -- 게시글 ID
    content VARCHAR(500) NOT NULL,                         -- 댓글 내용
    FOREIGN KEY (board_id) REFERENCES board(id)    -- 게시글과 연관 관계
    ON DELETE CASCADE                              -- 게시글 삭제 시 댓글도 삭제
);

-- 데이터 삽입 예제
INSERT INTO board (title, content) VALUES ('두번째입니다', '감사합니다');
INSERT INTO board (title, content) VALUES ('세번째입니다', '감사합니다');
INSERT INTO board (title, content) VALUES ('네번째입니다', '감사합니다');

-- 댓글 데이터 삽입
INSERT INTO comments (board_id, content) VALUES (1, '첫 번째 게시글의 첫 번째 댓글');
INSERT INTO comments (board_id, content) VALUES (1, '첫 번째 게시글의 두 번째 댓글');
INSERT INTO comments (board_id, content) VALUES (2, '두 번째 게시글의 첫 번째 댓글');