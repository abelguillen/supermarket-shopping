package com.aguillen.supermarketshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aguillen.supermarketshopping.dto.ArticleDTO;
import com.aguillen.supermarketshopping.model.Article;
import com.aguillen.supermarketshopping.repository.ArticleRepository;
import com.aguillen.supermarketshopping.util.Mapper;

@Service
public class ArticleService {
	
	@Autowired
	private ArticleRepository repository;
	
	public List<ArticleDTO> getAll() {
		try {
			return Mapper.convertArticleBoToDto(repository.findAll());
		} catch(Exception ex) {
			return null;
		}
	}
	
	public List<ArticleDTO> getByCategory(String category) {
		try {
			return Mapper.convertArticleBoToDto(repository.findByCategory(category));
		} catch(Exception ex) {
			return null;
		}
	}

	public ArticleDTO getOne(Integer id) {
		try {
			return Mapper.buildArticleDTO(repository.getOne(id));
		} catch(Exception ex) {
			return null;
		}
	}
	
	public ArticleDTO save(Article article) {
		try {
			return Mapper.buildArticleDTO(repository.save(article));
		} catch(Exception ex) {
			return null;
		}
	}
	
	public boolean deleteById(Integer id) {
		try {
			repository.deleteById(id);
			return true;
		} catch(Exception ex) {
			return false;
		}
	}
	
}
