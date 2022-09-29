package com.www.vitasoft.bbiyakapi.application.controller;

import com.www.vitasoft.bbiyakapi.application.request.UserRequest;
import com.www.vitasoft.bbiyakapi.domain.service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @PostMapping
    public void createUser(@RequestBody UserRequest userRequest) {
        userService.createUser(userRequest.getUsername(), userRequest.getPassword(), userRequest.getEmail());
    }
}
