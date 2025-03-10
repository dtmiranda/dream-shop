package com.dtmiranda.dreamshop.service.product;

import com.dtmiranda.dreamshop.model.Product;
import lombok.extern.java.Log;

import java.util.List;

public interface IProductService {
  Product addProduct(Product product);

  Product getProductById(Long id);

  void deleteProductById(Long id);

  void updateProduct(Product product, Long productId);
  List<Product> getAllProducts();
  List<Product> getProductsByCategory(String category);
  List<Product> getProductsByBrand(String brand);
  List<Product> getProductsByCategoryAndBrand(String category, String brand);
  List<Product> getProductsByName(String name);
  List<Product> getProductByBrandAndName(String brand, String name);
  Long countProductsByBrandAndName(String brand, String name);






}
