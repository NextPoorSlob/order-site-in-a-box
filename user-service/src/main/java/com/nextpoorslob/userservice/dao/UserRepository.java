package com.nextpoorslob.userservice.dao;

import com.nextpoorslob.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
