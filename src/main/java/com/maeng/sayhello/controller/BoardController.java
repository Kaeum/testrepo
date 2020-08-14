package com.maeng.sayhello.controller;

import com.maeng.sayhello.domain.entity.Board;
import com.maeng.sayhello.dto.BoardDto;
import com.maeng.sayhello.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/")
    public String list(Model model){
        List<Board> boardList = boardService.getBoardList();
        model.addAttribute("boardList", boardList);
        return "board/list.html";
    }

    @GetMapping("/write")
    public String write(){
        return "board/write.html";
    }

    @PostMapping("/write")
    public String write(BoardDto boardDto){
        boardService.writeBoard(boardDto);
        return "redirect:/";
    }

}
