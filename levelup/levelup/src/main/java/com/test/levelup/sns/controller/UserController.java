package com.test.levelup.sns.controller;


import com.test.levelup.sns.model.UserDto;
import com.test.levelup.sns.model.UserPostDto;
import com.test.levelup.sns.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @PostMapping("/signin")
    public ResponseEntity<?> createUser(@RequestBody UserDto userDto) {
        userService.createUser(userDto);
        return ResponseEntity.ok("추가되었습니다");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Long id){
        userService.delteUser(id);
        return ResponseEntity.ok("삭제되었습니다");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateUser(@PathVariable("id") Long id,@RequestBody UserDto userDto){
        userService.updateUser(id,userDto);
        return ResponseEntity.ok("수정되었습니다.");
    }

    @GetMapping("/find") // 전체 보여주기
    public ResponseEntity<?> findAll(){
        List<UserDto> allUser = userService.findAll();
        return ResponseEntity.ok(allUser);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<?> findByID(@PathVariable("id") Long id){
        UserDto findByUser = userService.findById(id);
        return  ResponseEntity.ok(findByUser);
    }

    @GetMapping("/com")
    public ResponseEntity<?> PostUser(){
        List<UserPostDto> postUser = userService.postAll();
        return ResponseEntity.ok(postUser);
    }

    @GetMapping("/like")
    public ResponseEntity<?> LikeUser(){
        return ResponseEntity.ok(userService.likeUser());
    }
}
