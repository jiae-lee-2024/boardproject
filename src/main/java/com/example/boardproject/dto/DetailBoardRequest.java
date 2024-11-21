package com.example.boardproject.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class DetailBoardRequest {
    private Long id;
    private String title;
    private String content;


}
