package com.pycogroup.pizza.service;

import java.util.ArrayList;

import com.pycogroup.pizza.common.GenericResponse;
import com.pycogroup.pizza.common.GenericResponseCollection;
import com.pycogroup.pizza.model.Category;
import com.pycogroup.pizza.model.Product;


public interface ProductService {

  // admin services
  GenericResponse createProduct(Product product);
  GenericResponse createBulk(ArrayList<Product> products);
  GenericResponse deleteProduct(String productId);
  GenericResponse updateProduct(String productId, Product product);

  // user services
  GenericResponse getProductById(String productId);
  GenericResponseCollection getProductCardsByCategoryWithPagination(Category category, int size, int page);
  GenericResponseCollection getAllProductCardsWithPagination(int size, int page);
}
