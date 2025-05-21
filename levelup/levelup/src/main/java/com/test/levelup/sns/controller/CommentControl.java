package com.test.levelup.sns.controller;

import com.test.levelup.sns.model.CommentDto;
import com.test.levelup.sns.service.CommentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/comment")
@Tag(name = "댓글 컨트롤러")

public class CommentControl {
    private final CommentService commentService;

    @GetMapping
    public ResponseEntity<?> getAllComment(){
        return ResponseEntity.ok(commentService.getCommentAll());
    }

    @PostMapping
    public ResponseEntity<?> createComment(@RequestBody CommentDto commentDto){
        commentService.createComment(commentDto);
        return ResponseEntity.ok("생성되었습니다.");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteComment(@PathVariable("id") Long id){
        commentService.deleteComment(id);
        return ResponseEntity.ok("삭제되었습니다.");
    }

    // 댓글 수정
    @PutMapping("/{id}")
    public ResponseEntity<?> updateComment(@PathVariable("id") Long id, @RequestBody CommentDto commentDto){
        commentService.updateCom(id,commentDto);
        return ResponseEntity.ok("수정되었습니다.");
    }
    
    // 댓글 사용자 조회
    @GetMapping("/post")
    public ResponseEntity<?> getPostComment(){
        return ResponseEntity.ok(commentService.commentPost());
    }
}
