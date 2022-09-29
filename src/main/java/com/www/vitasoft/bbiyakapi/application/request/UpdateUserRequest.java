package com.www.vitasoft.bbiyakapi.application.request;

import lombok.Data;

@Data
public class UpdateUserRequest {
    private String password;
    private String email;
}
