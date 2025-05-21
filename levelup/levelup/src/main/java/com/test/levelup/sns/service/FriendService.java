package com.test.levelup.sns.service;

import com.test.levelup.sns.model.FriendDto;

import java.util.List;

public interface FriendService {
    List<FriendDto> getFriendAll();

    void createFriend(FriendDto friendDto);

    void deleteFriend(Long id);

    void updateFriend(Long id, FriendDto friendDto);
}
