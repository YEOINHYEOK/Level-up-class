package com.test.levelup.sns.controller;

import com.test.levelup.sns.model.FriendDto;
import com.test.levelup.sns.service.FriendService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/friend")
public class FriendControl {
    private  final  FriendService friendService;

    @GetMapping
    public ResponseEntity<?> getAllFriend(){
        return ResponseEntity.ok(friendService.getFriendAll());
    }

    @PostMapping
    public ResponseEntity<?> createFriend(@RequestBody FriendDto friendDto){
        friendService.createFriend(friendDto);
        return ResponseEntity.ok("생성되었습니다.");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteFriend(@PathVariable("id") Long id){
        friendService.deleteFriend(id);
        return ResponseEntity.ok("삭제되었습니다.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateFriend(@PathVariable("id") Long id, @RequestBody FriendDto friendDto){
        friendService.updateFriend(id,friendDto);
        return ResponseEntity.ok("수정되었습니다.");
    }
}
