package com.example.boardproject.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestParam;

@Getter
@Setter
@AllArgsConstructor
public class InsertBoardRequest {
    @NotNull(message = "제목(title)은 필수입니다.")
    private String title;
    @NotNull(message = "내용(content)은 필수입니다.")
    private String content;
}
