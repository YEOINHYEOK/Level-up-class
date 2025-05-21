package com.test.levelup.sns.service;

import com.test.levelup.sns.mapper.FriendMapper;
import com.test.levelup.sns.model.FriendDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class FriendServiceImpl implements FriendService{
    private final FriendMapper friendMapper;

    @Override
    public List<FriendDto> getFriendAll() {
        return friendMapper.findAll();
    }

    @Override
    public void createFriend(FriendDto friendDto) {
        friendMapper.createAll(friendDto);
    }

    @Override
    public void deleteFriend(Long id) {
        friendMapper.deleteAll(id);
    }

    @Override
    public void updateFriend(Long id, FriendDto friendDto) {
        friendDto.setId(id);
        friendMapper.updateAll(friendDto);
    }


}
