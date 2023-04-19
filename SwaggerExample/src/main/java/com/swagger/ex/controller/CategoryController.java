package com.swagger.ex.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.ex.config.ApiResponse;
import com.swagger.ex.model.Category;
import com.swagger.ex.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController 
{
	@Autowired
	private CategoryService categoryService;
	
    //add new category
	@PostMapping("/create")
	public ResponseEntity<ApiResponse>createCategory(@RequestBody Category category)
	{
		categoryService.createCategory(category);
		return new ResponseEntity<>(new ApiResponse( true,"create a new category"),HttpStatus.CREATED);
	}
	
	//view all category
	@GetMapping("/list")
	public List<Category> getCategory()
	{
		return 	categoryService.getCategory();
	}
	
	//view category base on id
	@GetMapping("/list/{id}")
	public Optional<Category> getSingleCategory(@PathVariable("id") int id)
	{
		return 	categoryService.getSingleCategory(id);
	}
	
	//update category
	@PutMapping("/update/{id}")
	public ResponseEntity<ApiResponse> updateCategory(@PathVariable("id") int id, @RequestBody Category category)
	{
		categoryService.updateCategory(category);
		return new ResponseEntity<>(new ApiResponse( true,"update category"),HttpStatus.CREATED);
	}
	
	//delete category based on id
	@DeleteMapping("/delete/{id}")
	public String deleteCategory(@PathVariable("id") int id )
	{
	categoryService.deleteCategory(id);
	return "deleted";
}
}