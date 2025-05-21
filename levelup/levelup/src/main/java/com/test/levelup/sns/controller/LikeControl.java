package com.test.levelup.sns.controller;

import com.test.levelup.sns.model.LikeDto;
import com.test.levelup.sns.service.LikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/like")
public class LikeControl {
    private final LikeService likeService;

    @GetMapping
    public ResponseEntity<?> getALlLike(){
        return ResponseEntity.ok(likeService.getLike());
    }

    @PostMapping
    public ResponseEntity<?> selectLike(@RequestBody LikeDto likeDto){
        likeService.selectLike(likeDto);
        return ResponseEntity.ok("저장되었습니다.");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteLike(@PathVariable("id") Long id){
        likeService.deleteLike(id);
        return ResponseEntity.ok("삭제되었습니다.");
    }

    @GetMapping("/{postId}")
    public ResponseEntity<?> getAllLike(@PathVariable("postId") Long postId){
        return ResponseEntity.ok(likeService.getLikePost(postId));
    }

    @GetMapping("/com/{commentId}")
    public ResponseEntity<?> getAllComment(@PathVariable("commentId") Long commentId){
        return ResponseEntity.ok(likeService.getComment(commentId));
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<?> userComment(@PathVariable("id") Long id){
        return ResponseEntity.ok(likeService.userComment(id));
    }
}
