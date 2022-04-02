package com.ms.products.dao;

import org.springframework.data.repository.CrudRepository;

import com.ms.products.models.entity.Product;

public interface ProductDao extends CrudRepository<Product, Long> {

}
