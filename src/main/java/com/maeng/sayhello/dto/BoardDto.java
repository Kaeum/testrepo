package com.maeng.sayhello.dto;

import com.maeng.sayhello.domain.entity.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardDto {
    private Long id;
    private String writer;
    private String title;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public Board toEntity(){
        return Board.builder()
                .id(id)
                .writer(writer)
                .title(title)
                .content(content)
                .build();
    }

}
