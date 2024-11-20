package com.example.boardproject.mapper;

import com.example.boardproject.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

     List<BoardDTO> getBoardList(BoardDTO boardDTO); // 모든 게시글 조회

     BoardDTO selectBoardDetail(Long id); // 특정 게시글 조회
     void insertBoard(BoardDTO boardDTO);
     void updateBoard(BoardDTO boardDTO);
     void deleteBoard(Long id);
}




