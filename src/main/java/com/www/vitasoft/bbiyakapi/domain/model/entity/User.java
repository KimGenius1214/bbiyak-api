package com.www.vitasoft.bbiyakapi.domain.model.entity;

import com.www.vitasoft.bbiyakapi.domain.model.dto.GetUserDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    public String username;

    public String password;

    public String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public User(GetUserDto getUserDto){
        this.username = getUserDto.getUsername();
        this.password = getUserDto.getPassword();
        this.email = getUserDto.getEmail();
    }
}
