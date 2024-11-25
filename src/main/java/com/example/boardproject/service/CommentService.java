package com.example.boardproject.service;

import com.example.boardproject.dto.CommentDTO;
import com.example.boardproject.dto.InsertCommentRequest;
import com.example.boardproject.dto.UpdateCommentRequest;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface CommentService {
    List<CommentDTO> getCommentsList(Long boardId);
    void insertComment(InsertCommentRequest req);
    void updateComment(UpdateCommentRequest req);
    void deleteComment(@RequestParam("commentId")Long commentId);


}

