package com.example.boardproject.dto;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO {
    private Long commentId;
    private Long boardId; // 댓글이 달린 게시글 ID
    private String content;
}


