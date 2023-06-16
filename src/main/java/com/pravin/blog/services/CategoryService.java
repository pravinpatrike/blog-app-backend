package com.pravin.blog.services;

import com.pravin.blog.payloads.CategoryDto;

import java.util.List;

public interface CategoryService {

    /* public keyword is not necessary to write in interface by default it's public. */

    //create

    CategoryDto createCategory(CategoryDto categoryDto);

    //update
    CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);

    //delete

    public void deleteCategory(Integer categoryId);

    //get

    CategoryDto getCategory(Integer categoryId);

    //get all

    List<CategoryDto> getCategories();
}
