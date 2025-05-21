package com.test.levelup.sns.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class FriendDto {
    @Schema(description = "친구 고유 id", example = "1")
    private Long id;
    @Schema(description = "유저 id", example = "1")
    private Long userId;
    @Schema(description = "친구 id", example = "1")
    private Long friendId;
    @Schema(description = "생성일", example = "2025-05-19")
    private LocalDateTime createdDt;
    @Schema(description = "수정일", example = "2025-05-19")
    private LocalDateTime updatedDt;
}
