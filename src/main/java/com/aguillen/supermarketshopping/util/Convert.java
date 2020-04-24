package com.aguillen.supermarketshopping.util;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aguillen.supermarketshopping.dto.ArticleDTO;
import com.aguillen.supermarketshopping.model.Article;

@Component
public class Convert {

	@Autowired
	private static ModelMapper modelMapper = new ModelMapper();
	
	public static ArticleDTO buildDTO(Article article) {
		return modelMapper.map(article, ArticleDTO.class);
	}
	
	public static Article buildBO(ArticleDTO articleDTO) {
		return modelMapper.map(articleDTO, Article.class);
	}
	
	public static List<ArticleDTO> convertBoToDto(List<Article> articles) {
		List<ArticleDTO> articlesDTO = new ArrayList<ArticleDTO>();
		for(Article article : articles) {
			articlesDTO.add(buildDTO(article));
		}
		return articlesDTO;
	}
	
}
