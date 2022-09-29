package com.www.vitasoft.bbiyakapi.domain.service;

import com.www.vitasoft.bbiyakapi.application.request.UpdateUserRequest;
import com.www.vitasoft.bbiyakapi.application.response.GetUsersResponse;
import com.www.vitasoft.bbiyakapi.domain.model.dto.GetUserDto;
import com.www.vitasoft.bbiyakapi.domain.model.entity.User;
import com.www.vitasoft.bbiyakapi.domain.model.repository.UserRepository;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void createUser(String username, String password, String email) {
        if (userRepository.existsByUsername(username)) {
            throw new RuntimeException("이미 존재하는 사용자입니다.");
        }

        User user = new User(username, password, email);
        userRepository.save(user);
    }

    public List getUsers() {
        return (userRepository.findAll());
    }

    public GetUserDto getUser(String username){
        return new GetUserDto(userRepository.findByUsername(username));
    }

    @Transactional
    public void deleteUser(String username){
        userRepository.deleteByUsername(username);
    }

    @Transactional
    public void updateUser(String username, UpdateUserRequest updateUserRequest){
        User user = userRepository.findByUsername(username);
        user.password = updateUserRequest.getPassword();
        user.email = updateUserRequest.getEmail();
        userRepository.save(user);
    }



}
