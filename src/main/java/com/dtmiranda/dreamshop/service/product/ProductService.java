package com.dtmiranda.dreamshop.service.product;

import com.dtmiranda.dreamshop.exceptions.ProductNotFoundException;
import com.dtmiranda.dreamshop.model.Product;
import com.dtmiranda.dreamshop.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {

  private ProductRepository productRepository;

  @Override
  public Product addProduct(Product product) {
    return null;
  }

  @Override
  public Product getProductById(Long id) {
    return productRepository.findById(id)
            .orElseThrow(()-> new ProductNotFoundException("Product not found!"));
  }

  @Override
  public void deleteProductById(Long id) {
    productRepository.findById(id).ifPresentOrElse(productRepository::delete,
            ()->{throw new ProductNotFoundException("Product not found");});

  }

  @Override
  public void updateProduct(Product product, Long productId) {

  }

  @Override
  public List<Product> getAllProducts() {
    return productRepository.findAll();
  }

  @Override
  public List<Product> getProductsByCategory(String category) {
    return productRepository.finByCategoryName(category);
  }

  @Override
  public List<Product> getProductsByBrand(String brand) {
    return productRepository.findByBrand(brand);
  }

  @Override
  public List<Product> getProductsByCategoryAndBrand(String category, String brand) {
    return productRepository.findByCategoryNameAndBrand(category, brand);
  }

  @Override
  public List<Product> getProductsByName(String name) {
    return productRepository.findByName(name);
  }

  @Override
  public List<Product> getProductByBrandAndName(String brand, String name) {
    return productRepository.findByBrandAndName(brand, name);
  }

  @Override
  public Long countProductsByBrandAndName(String brand, String name) {
    return productRepository.countByBrandAndName(brand, name);
  }
}
