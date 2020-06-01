package com.aguillen.supermarketshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aguillen.supermarketshopping.dto.CategoryDTO;
import com.aguillen.supermarketshopping.repository.CategoryRepository;
import com.aguillen.supermarketshopping.util.Mapper;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository category;
	
	public List<CategoryDTO> getAll() {
		try {
			return Mapper.convertCategoryBoToDto(category.findAll());
		} catch(Exception ex) {
			return null;
		}
	}
	
}
