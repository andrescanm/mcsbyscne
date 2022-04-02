package com.ms.products.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ms.products.models.entity.Product;
import com.ms.products.models.services.IProductService;

@RestController
public class ProductController {

	@Autowired
	private IProductService ps;

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return ps.findAll();
	}

	@GetMapping("/product/{id}")
	public Product getOneProduct(@PathVariable Long id) {
		return ps.findById(id);
	}

}
