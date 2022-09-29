package com.www.vitasoft.bbiyakapi.domain.model.dto;

import com.www.vitasoft.bbiyakapi.domain.model.entity.User;

import java.util.List;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class GetUserDto {
    private long id;
    private String username;
    private String password;
    private String email;

    public GetUserDto(User user) {
        this.id = user.id;
        this.username = user.username;
        this.password = user.password;
        this.email = user.email;
    }

    public GetUserDto(List<User> all) {
    }
}
