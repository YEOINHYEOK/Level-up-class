package com.test.levelup.sns.controller;

import com.test.levelup.sns.model.PostDetailDto;
import com.test.levelup.sns.model.PostDto;
import com.test.levelup.sns.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {

    private final PostService postService;

    // 전체 게시글 조회
    @GetMapping
    public ResponseEntity<?> getAllPost() {
        return ResponseEntity.ok(postService.getPostAll());
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> getFindPost(@PathVariable("userId") Long userId){
        return ResponseEntity.ok(postService.getFindPost(userId));
    }
    // 게시글 생성
    @PostMapping
    public ResponseEntity<?> createPost(@RequestBody PostDto postDto) {
        postService.createPost(postDto);
        return ResponseEntity.ok("저장되었습니다.");
    }

    // 게시글 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePost(@PathVariable("id") Long id) {
        postService.deletePost(id);
        return ResponseEntity.ok("삭제되었습니다.");
    }

    // 게시글 수정
    @PutMapping("/{id}")
    public ResponseEntity<?> updatePost(@PathVariable("id") Long id, @RequestBody PostDto postDto){
        postService.updatePost(id, postDto);
        return ResponseEntity.ok("수정되었습니다.");
    }

    @GetMapping("/detail")
    public ResponseEntity<?> getDetailPost() {
        List<PostDetailDto> getDetailPost = postService.findDetailPost();
        return ResponseEntity.ok(getDetailPost);
    }
}
