package com.example.boardproject.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor // 기본생성자 추가
public class UpdateBoardRequest {
    private Long id;
    private String title;
    private String content;
}


