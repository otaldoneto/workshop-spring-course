package com.devneto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devneto.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
