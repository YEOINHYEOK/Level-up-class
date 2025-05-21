package com.test.levelup.sns.service;

import com.test.levelup.sns.model.PostDetailDto;
import com.test.levelup.sns.model.PostDto;

import java.util.List;

public interface PostService {
    List<PostDto> getPostAll();

    void createPost(PostDto postDto);

    void deletePost(Long id);

    void updatePost(Long id, PostDto postDto);

    List<PostDto> getFindPost(Long userId);


    List<PostDetailDto> findDetailPost();
}
