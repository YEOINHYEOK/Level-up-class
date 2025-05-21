package com.test.levelup.sns.service;

import com.test.levelup.sns.mapper.PostMapper;
import com.test.levelup.sns.model.PostDetailDto;
import com.test.levelup.sns.model.PostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostMapper postMapper;

    @Override
    public List<PostDto> getPostAll() {
        return postMapper.findAll();
    }

    @Override
    public void createPost(PostDto postDto) {
        postMapper.createPost(postDto);
    }

    @Override
    public void deletePost(Long id) {
        postMapper.deletePost(id);
    }

    @Override
    public void updatePost(Long id, PostDto postDto) {
        postDto.setId(id);
        postMapper.updatePost(postDto);
    }

    @Override
    public List<PostDto> getFindPost(Long userId) {
        return postMapper.findpost(userId);
    }

    @Override
    public List<PostDetailDto> findDetailPost() {
        return postMapper.findDetailPost();
    }
}
