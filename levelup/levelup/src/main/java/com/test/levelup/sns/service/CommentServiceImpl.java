package com.test.levelup.sns.service;

import com.test.levelup.sns.mapper.CommentMapper;
import com.test.levelup.sns.model.CommentDto;
import com.test.levelup.sns.model.CommentPostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService{
    private final CommentMapper commentMapper;
    @Override
    public List<CommentDto> getCommentAll() {
        return commentMapper.findAll();
    }

    @Override
    public void createComment(CommentDto commentDto) {
        commentMapper.createAll(commentDto);
    }

    @Override
    public void deleteComment(Long id) {
        commentMapper.deleteCom(id);
    }

    @Override
    public void updateCom(Long id, CommentDto commentDto) {
        commentDto.setId(id);
        commentMapper.updateCom(commentDto);
    }

    @Override
    public List<CommentPostDto> commentPost() {
        return commentMapper.commentWithPost();
    }
}
