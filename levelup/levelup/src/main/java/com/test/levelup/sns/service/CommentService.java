package com.test.levelup.sns.service;

import com.test.levelup.sns.model.CommentDto;
import com.test.levelup.sns.model.CommentPostDto;

import java.util.List;

public interface CommentService {
    List<CommentDto> getCommentAll();

    void createComment(CommentDto commentDto);

    void deleteComment(Long id);

    void updateCom(Long id, CommentDto commentDto);

    List<CommentPostDto> commentPost();
}
