package com.oes.service;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import com.oes.entity.Product;
import com.oes.entity.Review;
import com.oes.repository.ReviewRepository;
import com.oes.repository.UserRepository;

public class ProductServiceImpl implements ProductService{

	@Autowired
	ReviewRepository reviewRepository;
	
	@Autowired
	UserRepository userRepository;
	
	

	@Override
	public List<Product> getAllProductbyUser(String username) throws Exception {

		User user = (User) userRepository.getUsersByUsername(username);
		
		
		return null;
	}

	@Override
	public Product addProduct(Product product) {
		Product savedProduct = reviewRepository.save(product);
		return savedProduct;
	}
	

}