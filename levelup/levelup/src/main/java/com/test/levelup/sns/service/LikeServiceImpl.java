package com.test.levelup.sns.service;

import com.test.levelup.sns.mapper.LikeMapper;
import com.test.levelup.sns.model.LikeDto;
import com.test.levelup.sns.model.UserLikeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LikeServiceImpl implements LikeService{
    private final LikeMapper likeMapper;

    @Override
    public List<LikeDto> getLike() {
        return likeMapper.findAll();
    }

    @Override
    public void selectLike(LikeDto likeDto) {
        likeMapper.createAll(likeDto);
    }

    @Override
    public void deleteLike(Long id) {
        likeMapper.deleteAll(id);
    }

    @Override
    public int getLikePost(Long postId) {
        return likeMapper.findPost(postId);
    }

    @Override
    public int getComment(Long commentId) {
        return likeMapper.findComment(commentId);
    }

    @Override
    public List<UserLikeDto> userComment(Long id) {
        return likeMapper.userWithComment(id);
    }
}
