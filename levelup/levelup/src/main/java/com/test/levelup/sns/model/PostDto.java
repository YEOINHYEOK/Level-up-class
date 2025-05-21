package com.test.levelup.sns.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class PostDto {
    @Schema(description = "게시글 id", example = "1")
    private Long id;
    @Schema(description = "유저 아이디", example = "1")
    private Long userId;
    @Schema(description = "게시글 이미지", example = "test33123.png or .jpg")
    private String postImg;
    @Schema(description = "게시글 글", example = "test입니다.")
    private String postText;
    private LocalDate postDt;
    @Schema(description = "릴스", example = "reels")
    private String reels;
    @Schema(description = "게시글 태그", example = "#예시")
    private String postTag;
    @Schema(description = "생성일", example = "2025-05-19")
    private LocalDateTime createdDt;
    @Schema(description = "수정일", example = "2025-05-19")
    private LocalDateTime updatedDt;
    private int postState;
}
