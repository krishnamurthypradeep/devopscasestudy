package com.example.devopscasestudy.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.devopscasestudy.model.Product;
import com.example.devopscasestudy.repo.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}

}
