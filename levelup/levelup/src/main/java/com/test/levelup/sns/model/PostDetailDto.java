package com.test.levelup.sns.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter

public class PostDetailDto {
    private Long id;
    private String postImg;
    private String postText;
    private LocalDate postDt;
    private String reels;
    private int commentCount;
    private int likeCount;
}