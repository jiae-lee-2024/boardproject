package com.example.boardproject.service;

import com.example.boardproject.dto.BoardDTO;
import com.example.boardproject.entity.*;

import java.util.List;

public interface BoardService {

    List<BoardDTO> getBoardList(ListBoardRequest req) throws Exception;
    BoardDTO getBoardDetail(DetailBoardRequest req);
    void insertBoard(InsertBoardRequest req);
    void updateBoard(UpdateBoardRequest req);
    void deleteBoard(DeleteBoardRequest req);






}

