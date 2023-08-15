package com.elias.productosycategorias.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.elias.productosycategorias.models.CategoryModel;
import com.elias.productosycategorias.models.ProductModel;


public interface ProductRepo extends CrudRepository<ProductModel, Long>{
	
List<ProductModel> findAll();
List<ProductModel> findByCategoriesNotContains(CategoryModel categoria);
}