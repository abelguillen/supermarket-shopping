package com.aguillen.supermarketshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aguillen.supermarketshopping.dto.CategoryDTO;
import com.aguillen.supermarketshopping.service.CategoryService;
import com.aguillen.supermarketshopping.util.Mapper;

@RestController
@RequestMapping(value="/category")
public class CategoryController {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping("/list")
    public List<CategoryDTO> getAll(){
        return service.getAll();
    }
	
	@PostMapping("/create")
	public CategoryDTO create(@RequestBody CategoryDTO categoryDTO) {
		return service.save(Mapper.buildCategoryBO(categoryDTO));
	}

}
