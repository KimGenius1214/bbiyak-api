package com.www.vitasoft.bbiyakapi.application.response;

import com.www.vitasoft.bbiyakapi.domain.model.dto.GetUserDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GetUserResponse {
    private final GetUserDto user;
}
