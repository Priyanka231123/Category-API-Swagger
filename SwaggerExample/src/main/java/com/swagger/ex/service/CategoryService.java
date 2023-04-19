package com.swagger.ex.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.swagger.ex.model.Category;
import com.swagger.ex.repo.CategoryRepo;

@Service
public class CategoryService
{
@Autowired
CategoryRepo repo;


//add new category
public void createCategory(Category category)
{
	repo.save(category);
}

//view all category
public List<Category> getCategory()
{
	return repo.findAll();
}

//view category base on id
public Optional<Category> getSingleCategory(Integer id)
{
	return repo.findById(id);
}

//update category
public void updateCategory(Category category)
{
	 repo.save(category);
	
}

//delete category based on id
public void deleteCategory(@PathVariable("id") int id )
{
	repo.deleteById(id);
}
}
