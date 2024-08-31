package com.devneto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devneto.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
