package com.umakant.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umakant.userservice.entity.User;

public interface UserServiceRepository extends JpaRepository<User, Long>{

	User findByUserId(Long userId);

}
