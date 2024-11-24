package com.sham.java_multithreading.repository;

import com.sham.java_multithreading.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
