package com.www.vitasoft.bbiyakapi.domain.model.repository;

import com.www.vitasoft.bbiyakapi.domain.model.dto.GetUserDto;
import com.www.vitasoft.bbiyakapi.domain.model.entity.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUsername(String username);
    void deleteByUsername(String username);
    User findByUsername(String username);
}
