package com.example.boardproject.dto;

import lombok.*;
import org.springframework.web.ErrorResponse;

@Builder
@Getter
@Setter
@NoArgsConstructor // 수정
@AllArgsConstructor // 수정
public class BoardDTO {
    private Long id;
    private String title;
    private String content;
}