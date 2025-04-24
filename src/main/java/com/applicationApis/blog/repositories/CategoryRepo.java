package com.applicationApis.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.applicationApis.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
