package com.www.vitasoft.bbiyakapi.application.request;

import lombok.Data;

@Data
public class UserRequest {
    private String username;
    private String password;
    private String email;
}
