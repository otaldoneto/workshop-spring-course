package com.devneto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devneto.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
