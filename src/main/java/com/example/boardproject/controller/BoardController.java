package com.example.boardproject.controller;

import com.example.boardproject.dto.BoardDTO;
import com.example.boardproject.service.BoardService;
import org.apache.ibatis.annotations.Lang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/api/boards")
public class BoardController {

    @Autowired
    private BoardService boardService;

    /**
     * 게시판 목록 조회
     * GET /api/boards
     */
    @GetMapping
    public APIResponse getBoardList(@RequestParam("boardNo") BigInteger boardNo ) throws Exception {
        List<BoardDTO> boardList = boardService.getAllBoards(boardNo);
        return new APIResponse(HttpStatus.OK.value(), boardList, "게시판 목록 조회 성공");
    }
    @GetMapping
    public APIResponse getBoardList(@RequestParam("langType") String langType) throws Exception {
        List<BoardDTO> boardList = boardService.getAllBoards(langType);
        return new APIResponse(HttpStatus.OK.value(), boardList, "게시판 목록 조회 성공");
    }


    /**
     * 게시판 상세 조회
     * GET /api/boards/{id}
     */
    @GetMapping("/{id}")
    public APIResponse getBoardDetail(@PathVariable("id") Long id) throws Exception {
        BoardDTO boardDetail = boardService.getBoardById(id);
        return new APIResponse(HttpStatus.OK.value(), boardDetail, "목록 상세  조회 성공");
    }

    /**
     * 게시글 작성
     * POST /api/boards
     */
    @PostMapping
    public APIResponse createBoard(@RequestBody @Valid BoardDTO board) throws Exception {
        // 게시글 작성 서비스 호출
        boardService.createBoard(board);
        // 성공적인 응답 반환
        return new APIResponse(HttpStatus.CREATED.value(), null, "게시글 작성 완료");
    }

    /**
     * 게시글 수정
     * PUT /api/boards/{id}
     */
    @PutMapping("/{id}")
    public APIResponse updateBoard(@PathVariable("id") Long id, @RequestBody @Valid BoardDTO board) throws Exception {
        board.setId(id);
        boardService.updateBoard(board);
        return new APIResponse(HttpStatus.OK.value(), null, "게시글 수정 완료");
    }

    /**
     * 게시글 삭제
     * DELETE /api/boards/{id}
     */
    @DeleteMapping("/{id}")
    public APIResponse deleteBoard(@PathVariable("id") Long id) throws Exception {
        boardService.deleteBoard(id);
        return new APIResponse(HttpStatus.OK.value(), null, "게시글 삭제 완료");
    }
}
