package com.example.boardproject.service;

import com.example.boardproject.dto.BoardDTO;
import com.example.boardproject.entity.*;
import com.example.boardproject.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public abstract class BoardServiceImpl implements BoardService {

    private final BoardMapper boardMapper;

    @Autowired
    public BoardServiceImpl(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    // 게시판 목록 조회
    @Override
    public abstract List<BoardDTO> getBoardList(ListBoardRequest req) throws Exception;

    // 게시판 상세 조회
    @Override
    public BoardDTO getBoardDetail(DetailBoardRequest req) {
        return null;
    }

    // 게시판 등록
    @Override
    @Transactional
    public void insertBoard(InsertBoardRequest req) {


    }

    // 게시판 수정
    @Override
    @Transactional
    public void updateBoard(UpdateBoardRequest req) {

    }

    // 게시판 삭제
    @Override
    @Transactional
    public void deleteBoard(DeleteBoardRequest req) {

    }
}
