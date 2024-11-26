package com.example.boardproject.controller;

import com.example.boardproject.dto.ApiResponse;
import com.example.boardproject.dto.CommentDTO;
import com.example.boardproject.dto.InsertCommentRequest;
import com.example.boardproject.dto.UpdateCommentRequest;
import com.example.boardproject.service.CommentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boards")
public class CommentController {

    @Autowired
    private CommentService commentService;

    // 댓글 목록 조회
//    @GetMapping("/{boardId}/comments")
//    public ApiResponse getCommentsList(@PathVariable Long boardId) {
//        List<CommentDTO> getCommentsList = commentService.getCommentsList(boardId);
//        return new ApiResponse(true,"댓글 조회 성공", getCommentsList);
//    }
    // 댓글 등록(boardId,content)
    @PostMapping("/{boardId}/comments")
    public ApiResponse insertComment(@RequestBody @Valid InsertCommentRequest req) {
        commentService.insertComment(req);
        return new ApiResponse(true,"댓글 등록 성공");
    }
    // 댓글 수정(boardId,commentId,content)
    @PutMapping("/comments/{commentId}")
    public ApiResponse updateComment(@RequestBody UpdateCommentRequest req) {
        commentService.updateComment(req);
        return new ApiResponse(true,"댓글 수정 성공");
    }
    // 댓글 삭제
    @DeleteMapping("/comments/{commentId}")
    public ApiResponse deleteComment(@RequestParam(required = true)Long commentId) {
        commentService.deleteComment(commentId);
        return new ApiResponse(true,"댓글 삭제 성공");
    }
}
