package com.www.vitasoft.bbiyakapi.application.response;

import com.www.vitasoft.bbiyakapi.domain.model.dto.GetUserDto;
import com.www.vitasoft.bbiyakapi.domain.model.entity.User;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GetUsersResponse {
    private final List<GetUserDto> users;
}
