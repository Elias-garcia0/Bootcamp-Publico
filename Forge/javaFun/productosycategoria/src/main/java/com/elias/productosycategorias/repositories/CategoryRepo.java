package com.elias.productosycategorias.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.elias.productosycategorias.models.CategoryModel;
import com.elias.productosycategorias.models.ProductModel;

public interface CategoryRepo extends CrudRepository<CategoryModel, Long>{

	List<CategoryModel> findByProductsNotContains(ProductModel producto);
	List<CategoryModel> findAll();
}