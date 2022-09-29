package com.www.vitasoft.bbiyakapi.application.controller;

import com.www.vitasoft.bbiyakapi.application.request.UpdateUserRequest;
import com.www.vitasoft.bbiyakapi.application.request.UserRequest;
import com.www.vitasoft.bbiyakapi.application.response.GetUserResponse;
import com.www.vitasoft.bbiyakapi.application.response.GetUsersResponse;
import com.www.vitasoft.bbiyakapi.domain.model.entity.User;
import com.www.vitasoft.bbiyakapi.domain.service.UserService;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping
    public GetUsersResponse getUsers(){
        return new GetUsersResponse(userService.getUsers());
    }

    @GetMapping("/{username}")
    public GetUserResponse getUser(@PathVariable String username){
        return new GetUserResponse(userService.getUser(username));
    }

    @DeleteMapping("/{username}")
    public void deleteUser(@PathVariable String username){
        userService.deleteUser(username);
    }

    @PutMapping("/{username}")
    public void updateUser(@PathVariable String username, @RequestBody UpdateUserRequest updateUserRequest){
        userService.updateUser(username, updateUserRequest);
    }
}
