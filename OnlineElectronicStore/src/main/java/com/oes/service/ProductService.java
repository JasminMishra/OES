package com.oes.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.oes.entity.Product;
import com.oes.entity.Review;


@Service

public interface ProductService {
public Product addProduct(Product product);
	
	public List<Product> getAllProductbyUser(String username)throws Exception;



}