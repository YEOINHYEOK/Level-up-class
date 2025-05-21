package com.test.levelup.sns.service;


import com.test.levelup.sns.mapper.UserMapper;
import com.test.levelup.sns.model.UserDto;
import com.test.levelup.sns.model.UserLikeDto;
import com.test.levelup.sns.model.UserPostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class UserServiceImpl implements UserService{

    private final UserMapper userMapper;

    // 유저 생성
    @Override
    public void createUser(UserDto userDto) {
        userMapper.createUser(userDto);
    }

    @Override
    public void delteUser(Long id) {
        userMapper.deleteUser(id);
    }

    @Override
    public void updateUser(Long id, UserDto userDto) {
        userDto.setId(id);
        userMapper.updateUser(userDto);
    }

    @Override
    public List<UserDto> findAll() {
        return userMapper.findAll();
    }

    // 단건 조회
    @Override
    public UserDto findById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public List<UserPostDto> postAll() {
        return userMapper.userWithPost();
    }

    @Override
    public List<UserLikeDto> likeUser() {
        return userMapper.userWithLike();
    }
}
