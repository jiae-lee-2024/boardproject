package com.example.boardproject.mapper;

import com.example.boardproject.dto.CommentDTO;
import com.example.boardproject.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface CommentMapper {
    List<CommentDTO> getCommentsList(Long boardId); // 게시글에 달린 댓글 목록 조회
    void insertComment(Comment comment);
    void updateComment(Comment comment);
    void deleteComment(@RequestParam("commentId") Long commentId);


}
