package com.aguillen.supermarketshopping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SupermarketShoppingApplication {

	final static Logger LOG = LoggerFactory.getLogger(SupermarketShoppingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SupermarketShoppingApplication.class, args);
		LOG.info( "The Supermarket shopping is now running" );
	}
	
}
