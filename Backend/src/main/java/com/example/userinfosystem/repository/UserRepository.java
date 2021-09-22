package com.example.userinfosystem.repository;

import com.example.userinfosystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
