package com.jojoldu.book.springboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpateRequestDto {

    private String title;
    private String content;

    @Builder
    public PostsUpateRequestDto(String title, String content){
        this.title = title;
        this.content = content;
    }
}
