package com.swagger.ex.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="category")
public class Category 
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;

@Column(name="categoryName ")
private @NotBlank String categoryName;

@Column(name=" description")
private @NotBlank String description;

@Column(name="imageUrl ")
private @NotBlank String imageUrl;

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getImageUrl() {
	return imageUrl;
}
public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}
public Category(Integer id, @NotBlank String categoryName, @NotBlank String description, @NotBlank String imageUrl) {
	super();
	this.id = id;
	this.categoryName = categoryName;
	this.description = description;
	this.imageUrl = imageUrl;
}
@Override
public String toString() {
	return "Category [id=" + id + ", categoryName=" + categoryName + ", description=" + description + ", imageUrl="
			+ imageUrl + "]";
}
public Category() {
	super();
}


}
