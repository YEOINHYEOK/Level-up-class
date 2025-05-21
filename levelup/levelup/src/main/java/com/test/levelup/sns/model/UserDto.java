package com.test.levelup.sns.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter

public class UserDto {
    @Schema(description = "유저 아이디", example = "1")
    private Long id; // 고유 아이디
    @Schema(description = "로그인 아이디", example = "test")
    private String loginId; // 로그인 아이디
    @Schema(description = "비밀번호", example = "1234ABC")
    private String password; // 비밀번호
    @Schema(description = "나이", example = "19")
    private int age; // 나이
    @Schema(description = "성별", example = "남")
    private String gender; // 성별
    @Schema(description = "이름", example = "홀길동")
    private String name; // 이름
    @Schema(description = "휴대폰 번호", example = "010-1111-1111")
    private String phoneNumber; // 폰번호
    @Schema(description = "이메일", example = "test@gmail.com")
    private String email; // 이메일
    @Schema(description = "친구 수", example = "4")
    private String friendNum; // 친구 수
    @Schema(description = "유저 프로필 사진", example = "1rewr2213wrqdf23rf.png or .jpg")
    private String userProfileImg; // 유저 프로필 사진
    @Schema(description = "유저 상태", example = "1")
    private String userState; // 유저 상태
    @Schema(description = "유저 생일", example = "01.01")
    private Date userBirth; // 유저 생일
    @Schema(description = "생성일", example = "2025-05-19")
    private LocalDateTime createdDt; // 생성일
    @Schema(description = "수정일", example = "2025-05-19")
    private LocalDateTime updatedDt; // 수정일
}
