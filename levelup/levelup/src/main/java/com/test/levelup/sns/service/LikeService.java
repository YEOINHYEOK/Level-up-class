package com.test.levelup.sns.service;


import com.test.levelup.sns.model.LikeDto;
import com.test.levelup.sns.model.UserLikeDto;

import java.util.List;

public interface LikeService {
    List<LikeDto> getLike();

    void selectLike(LikeDto likeDto);

    void deleteLike(Long id);

    int getLikePost(Long postId);

    int getComment(Long commentId);

    List<UserLikeDto> userComment(Long id);
}
