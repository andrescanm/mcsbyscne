package com.ms.products.models.services;

import java.util.List;

import com.ms.products.models.entity.Product;

public interface IProductService {

	public List<Product> findAll();

	public Product findById(Long id);
}
