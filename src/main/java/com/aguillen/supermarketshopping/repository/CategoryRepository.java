package com.aguillen.supermarketshopping.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aguillen.supermarketshopping.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {
	
	public List<Category> findAll();

}
