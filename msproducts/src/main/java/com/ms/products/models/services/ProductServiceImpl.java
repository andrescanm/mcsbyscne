package com.ms.products.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ms.products.dao.ProductDao;
import com.ms.products.models.entity.Product;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private ProductDao dao;

	@Override
	@Transactional(readOnly = true)
	public List<Product> findAll() {
		return (List<Product>) dao.findAll();
	}

	@Override
	public Product findById(Long id) {
		return dao.findById(id).orElse(null);
	}

}
