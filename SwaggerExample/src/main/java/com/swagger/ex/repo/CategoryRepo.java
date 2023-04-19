package com.swagger.ex.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swagger.ex.model.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer>
{
	
}
