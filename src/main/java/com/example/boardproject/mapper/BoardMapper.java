package com.example.boardproject.mapper;

import com.example.boardproject.dto.BoardDTO;
import com.example.boardproject.dto.CommentDTO;
import com.example.boardproject.entity.Board;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface BoardMapper {
     List<BoardDTO> getBoardList(); // 모든 게시글 조회
     BoardDTO selectBoardDetail(@RequestParam("id") Long id); // 특정 게시글 조회
     // 게시글 아이디에 따른 댓글 목록
     List<CommentDTO> getCommentsBoardList(@RequestParam("boardId") Long boardId);
     void insertBoard(Board board);
     void updateBoard(Board board);
     void deleteBoard(@RequestParam("id") Long id);
}


