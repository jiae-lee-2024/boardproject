package com.example.boardproject.controller;

import com.example.boardproject.dto.*;
import com.example.boardproject.service.BoardService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boards")
public class BoardController {

    @Autowired
    private BoardService boardService;

    // 게시글 목록 조회
    @GetMapping("/get-post-list")
    public ApiResponse getBoardList() {
        List<BoardDTO> getBoardList = boardService.getBoardList();
        return new ApiResponse(true, "게시글 목록 조회 성공", getBoardList);
    }
    // 게시글 상세 조회
    @GetMapping("/{id}")
    public ApiResponse getBoardDetail(@PathVariable Long id) {
        BoardDTO boardDTO = boardService.getBoardDetail(id);
        return new ApiResponse(true, "게시글 상세 조회 성공", boardDTO);
    }
    // 게시글 등록
    @PostMapping("/insert-post")
    public ApiResponse insertBoard(@RequestBody @Valid InsertBoardRequest req){
        boardService.insertBoard(req);
        return new ApiResponse(true,"게시글 등록 성공");
    }
    // 게시글 수정
    @PutMapping("/update-post")
    public ApiResponse updateBoard(@RequestBody UpdateBoardRequest req){
        boardService.updateBoard(req);
        return new ApiResponse(true,"게시글 수정 성공");
    }
    // 게시글 삭제
    @DeleteMapping("/delete-post")
    public ApiResponse deleteBoard(@RequestParam(required = true) Long id){
        boardService.deleteBoard(id);
        return new ApiResponse(true,"게시글 삭제 성공");
    }
}