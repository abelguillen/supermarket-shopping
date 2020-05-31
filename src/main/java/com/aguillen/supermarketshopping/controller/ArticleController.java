package com.aguillen.supermarketshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aguillen.supermarketshopping.dto.ArticleDTO;
import com.aguillen.supermarketshopping.service.ArticleService;
import com.aguillen.supermarketshopping.util.Mapper;

@RestController
@RequestMapping(value="/article")
public class ArticleController {

	@Autowired
	private ArticleService service;
	
	@GetMapping("/list")
    public List<ArticleDTO> getAll(){
        return service.getAll();
    }
	
	@GetMapping("/{id}")
    public ArticleDTO getOne(@PathVariable("id") Integer id){
        return service.getOne(id);
    }
	
	@PostMapping("/create")
	public ArticleDTO create(@RequestBody ArticleDTO articleDTO) {
		return service.save(Mapper.buildBO(articleDTO));
	}
	
	@PutMapping("/update")
	public ArticleDTO update(@RequestBody ArticleDTO articleDTO) {
		return service.save(Mapper.buildBO(articleDTO));
	}
	
	@DeleteMapping("/delete")
	public boolean deleteById(@RequestParam("id") Integer id) {
		return service.deleteById(id);
	}
	
}
