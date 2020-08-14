package com.maeng.sayhello.service;

import com.maeng.sayhello.domain.entity.Board;
import com.maeng.sayhello.domain.repository.BoardRepository;
import com.maeng.sayhello.dto.BoardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Transactional
    public Long writeBoard(BoardDto boardDto){
        return boardRepository.save(boardDto.toEntity()).getId();
    }

    public List<Board> getBoardList() {
        List<Board> list = new ArrayList<>();
        System.out.println(list.size());

        return list;
    }
}
