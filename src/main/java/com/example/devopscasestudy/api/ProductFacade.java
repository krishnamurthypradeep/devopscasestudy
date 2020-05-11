package com.example.devopscasestudy.api;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.devopscasestudy.model.Product;

@Component
public class ProductFacade {
	
	
	@Autowired
	  private ProductService productService;

	  @Autowired
	  private ModelMapper modelMapper;

	  public List<ProductDTO> findAll(){
	     return convertToOrderDto(productService.findAll());
	  }

	  private List<ProductDTO> convertToOrderDto(List<Product> products) {
	   List<ProductDTO> productsDTO = modelMapper.map(products,new TypeToken<List<ProductDTO>>(){}.getType());
	   return productsDTO;
	  }

}
