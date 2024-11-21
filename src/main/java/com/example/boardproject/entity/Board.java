package com.example.boardproject.entity;

import com.example.boardproject.dto.DeleteBoardRequest;
import com.example.boardproject.dto.InsertBoardRequest;
import com.example.boardproject.dto.UpdateBoardRequest;
import lombok.*;
import org.springframework.util.StringUtils;


@Getter
@Setter
@NoArgsConstructor
public class Board {
    private Long id;
    private String title;
    private String content;

    // insert 메서드
    public Board insert(InsertBoardRequest req) {
        return Board.builder()
                .title(req.getTitle())
                .content(req.getContent())
                .build();
    }
    // update 메서드
    public Board update(UpdateBoardRequest req) {
        return Board.builder()
                .id(req.getId())// id는 Update 때 필요
                // 문자열이 null 또는 빈 문자열이 아닌지 확인
                .title(StringUtils.hasText(req.getTitle()) ? req.getTitle() : null)
                .content(StringUtils.hasText(req.getContent()) ? req.getContent() : null)
                .build();
    }

    // Builder 패턴을 이용한 생성자
    @Builder
    public Board(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;

    }
}