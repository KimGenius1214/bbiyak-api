package com.www.vitasoft.bbiyakapi.domain.service;

import com.www.vitasoft.bbiyakapi.domain.model.entity.User;
import com.www.vitasoft.bbiyakapi.domain.model.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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

}
