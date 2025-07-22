package com.rizwanmushtaq.repositories;

import com.rizwanmushtaq.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
