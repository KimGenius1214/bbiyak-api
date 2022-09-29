package com.www.vitasoft.bbiyakapi.domain.model.repository;

import com.www.vitasoft.bbiyakapi.domain.model.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUsername(String username);
}
