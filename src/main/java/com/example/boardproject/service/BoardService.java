package com.example.boardproject.service;

import com.example.boardproject.dto.*;

import java.util.List;

public interface BoardService {
    List<BoardDTO> getBoardList();
    BoardDTO getBoardDetail(Long id);
    void insertBoard(InsertBoardRequest req);
    void updateBoard(UpdateBoardRequest req);
    void deleteBoard(Long id);
}



