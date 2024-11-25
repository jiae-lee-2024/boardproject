package com.example.boardproject.service;

import com.example.boardproject.dto.CommentDTO;
import com.example.boardproject.dto.InsertCommentRequest;
import com.example.boardproject.dto.UpdateCommentRequest;
import com.example.boardproject.entity.Comment;
import com.example.boardproject.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.List;


@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public List<CommentDTO> getCommentsList(Long boardId) {
        return commentMapper.getCommentsList(boardId);
    }
    @Override
    @Transactional
    public void insertComment(InsertCommentRequest req) {
        if(ObjectUtils.isEmpty(req.getContent())) {
            System.out.println("내용이 없습니다");
        }
        Comment comment = Comment.builder().build().insert(req);
        commentMapper.insertComment(comment);
    }
    @Override
    @Transactional
    public void updateComment(UpdateCommentRequest req) {
        if(ObjectUtils.isEmpty(req.getCommentId())) {
            System.out.println("댓글 id가 없습니다.");
        }
        Comment comment = Comment.builder().build().update(req);
        commentMapper.updateComment(comment);
    }
    @Override
    public void deleteComment(Long commentId) {
        commentMapper.deleteComment(commentId);
    }
}

