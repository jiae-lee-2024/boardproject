package com.example.boardproject.entity;

import com.example.boardproject.dto.InsertCommentRequest;
import com.example.boardproject.dto.UpdateCommentRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Getter
@Setter
@NoArgsConstructor
public class Comment {
    private Long commentId;
    private Long boardId;
    private String content;

    // insert 메서드
   public Comment insert(InsertCommentRequest req) {
        return Comment.builder()
                .boardId(req.getBoardId())
                .content(req.getContent())
                .build();
   }
   // update 메서드
    public Comment update(UpdateCommentRequest req) {
       return Comment.builder()
               .commentId(req.getCommentId())
               .boardId(req.getBoardId())
               .content(StringUtils.hasText(req.getContent()) ? req.getContent() : null)
               .build();
   }
   // 빌더 패턴을 이용한 생성자
    @Builder
    public Comment(Long commentId, Long boardId, String content) {
        this.commentId = commentId;
        this.boardId = boardId;
        this.content = content;
   }

}








