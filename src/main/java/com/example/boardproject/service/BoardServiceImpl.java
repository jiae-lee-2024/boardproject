package com.example.boardproject.service;

import com.example.boardproject.dto.*;
import com.example.boardproject.entity.*;
import com.example.boardproject.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper boardMapper;

    @Override
    public List<BoardDTO> getBoardList() {
        return boardMapper.getBoardList();
    }

    @Override
    public BoardDTO getBoardDetail(Long id) {
     //   return boardMapper.selectBoardDetail(id);

        // 게시글 조회
        BoardDTO boardDto = boardMapper.selectBoardDetail(id);

        // 댓글 목록 조회
        List<CommentDTO> comments = boardMapper.getCommentsBoardList(id);
        boardDto.setComments(comments); // 댓글 목록 설정
        return boardDto;
    }

    @Override
    @Transactional //변경 일어날때만 사용
    public void insertBoard(InsertBoardRequest req) {
        // 방어코드
        if(ObjectUtils.isEmpty(req.getTitle())){
            System.out.println("제목이 없습니다!!!!");
        }

        if(ObjectUtils.isEmpty(req.getContent())){
            System.out.println("내용이 없습니다!!!!");
        }

        Board board = Board.builder().build().insert(req);
        boardMapper.insertBoard(board);
    }

    @Override
    @Transactional
    public void updateBoard(UpdateBoardRequest req) {
        Board board = Board.builder().build().update(req);
        boardMapper.updateBoard(board);
    }

    @Override
    @Transactional
    public void deleteBoard(Long id) {
        boardMapper.deleteBoard(id);
    }
}
