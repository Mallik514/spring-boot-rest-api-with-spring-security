package com.mallik.spring.boot.simplespringbootapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mallik.spring.boot.simplespringbootapplication.dto.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

	public User findByUsername(String username);
}
