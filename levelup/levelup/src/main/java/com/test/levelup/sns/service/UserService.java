package com.test.levelup.sns.service;


import com.test.levelup.sns.model.UserDto;
import com.test.levelup.sns.model.UserLikeDto;
import com.test.levelup.sns.model.UserPostDto;
import org.apache.catalina.User;

import java.util.List;

public interface UserService {
    void createUser(UserDto userDto); // 유저 생성
    void delteUser(Long id); // 유저 삭제
    void updateUser(Long id,UserDto userDto); // 수정
    List<UserDto> findAll(); //  다건 조회
    UserDto findById(Long id);

    List<UserPostDto> postAll();

    List<UserLikeDto> likeUser();
}
