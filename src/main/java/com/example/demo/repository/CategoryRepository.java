package com.example.demo.repository;

import com.example.demo.entity.Category;
import com.example.demo.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

    Optional<Category> findCategoryById(Long id);
}