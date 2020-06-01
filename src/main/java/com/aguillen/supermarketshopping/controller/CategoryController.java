package com.aguillen.supermarketshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aguillen.supermarketshopping.dto.CategoryDTO;
import com.aguillen.supermarketshopping.service.CategoryService;

@RestController
@RequestMapping(value="/category")
public class CategoryController {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping("/list")
    public List<CategoryDTO> getAll(){
        return service.getAll();
    }

}
