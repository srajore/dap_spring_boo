package com.zensar.spring_boot_app_ide.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.spring_boot_app_ide.dto.ProductDto;
import com.zensar.spring_boot_app_ide.entity.Product;
import com.zensar.spring_boot_app_ide.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;

	@Autowired
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public ProductDto getProduct(int productId) {
		Product product = productRepository.findById(productId).get();

		ProductDto productDto = new ProductDto(product.getProductId(), product.getProductName(),
				product.getProductCost());

		return productDto; // not a good practice
		// return productRepository.getById(productId); it's dep. method getById()
	}

	public List<ProductDto> getAllProducts() {

		List<Product> listOfProducts = productRepository.findAll();

		List<ProductDto> productDtos = new ArrayList<>();

		for (Product product : listOfProducts) {
			productDtos.add(new ProductDto(product.getProductId(), product.getProductName(), product.getProductCost()));
		}

		return productDtos;
	}

	public ProductDto insertProduct(ProductDto productDto) {

		Product product = new Product();

		product.setProductId(productDto.getProductId());
		product.setProductName(productDto.getProductName());
		product.setProductCost(productDto.getProductCost());

		productRepository.save(product);

		return productDto;
	}

}
