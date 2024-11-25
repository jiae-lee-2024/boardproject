package com.example.boardproject.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class InsertCommentRequest {
    private Long boardId;
    @NotNull(message = "내용(content)는 필수입니다.")
    private String content;
}
