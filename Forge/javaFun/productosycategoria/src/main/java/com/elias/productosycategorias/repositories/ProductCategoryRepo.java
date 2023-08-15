package com.elias.productosycategorias.repositories;

import org.springframework.data.repository.CrudRepository;

import com.elias.productosycategorias.models.ProductCategoryModel;

public interface ProductCategoryRepo extends CrudRepository<ProductCategoryModel,Long>{
	

}