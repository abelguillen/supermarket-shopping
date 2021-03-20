package com.aguillen.supermarketshopping.util;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.aguillen.supermarketshopping.dto.ArticleDTO;
import com.aguillen.supermarketshopping.dto.CategoryDTO;
import com.aguillen.supermarketshopping.model.Article;
import com.aguillen.supermarketshopping.model.Category;

@Component
public class Mapper {

	private static ModelMapper modelMapper = new ModelMapper();
	
	
	//Article
	
	public static ArticleDTO buildArticleDTO(Article article) {
		return modelMapper.map(article, ArticleDTO.class);
	}
	
	public static Article buildArticleBO(ArticleDTO articleDTO) {
		return modelMapper.map(articleDTO, Article.class);
	}
	
	public static List<ArticleDTO> convertArticleBoToDto(List<Article> articles) {
		List<ArticleDTO> articlesDTO = new ArrayList<ArticleDTO>();
		for(Article article : articles) {
			articlesDTO.add(buildArticleDTO(article));
		}
		return articlesDTO;
	}
	
	
	// Category
	
	public static CategoryDTO buildCategoryDTO(Category category) {
		return modelMapper.map(category, CategoryDTO.class);
	}
	
	public static Category buildCategoryBO(CategoryDTO categoryDTO) {
		return modelMapper.map(categoryDTO, Category.class);
	}
	
	public static List<CategoryDTO> convertCategoryBoToDto(List<Category> categorys) {
		List<CategoryDTO> categorysDTO = new ArrayList<CategoryDTO>();
		for(Category category : categorys) {
			categorysDTO.add(buildCategoryDTO(category));
		}
		return categorysDTO;
	}
	
}
