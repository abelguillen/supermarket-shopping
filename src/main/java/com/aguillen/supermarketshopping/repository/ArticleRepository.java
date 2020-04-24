package com.aguillen.supermarketshopping.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aguillen.supermarketshopping.model.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer>{
	
	public List<Article> findAll();
	
	public Article getOne(Integer id);
	
	@SuppressWarnings("unchecked")
	public Article save(Article article);
	
	public void deleteById(Integer id);
}
