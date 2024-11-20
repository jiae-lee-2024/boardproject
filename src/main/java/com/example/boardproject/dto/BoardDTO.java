package com.example.boardproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor // 수정
@AllArgsConstructor // 수정
public class BoardDTO {
    private Long id;
    private String title;
    private String content;
}

