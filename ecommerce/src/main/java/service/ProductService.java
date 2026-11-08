package com.example.ecommerce.service;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.repository.ProductRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Get product by ID
    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    // Create product
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    // Update product
    public Optional<Product> updateProduct(
            String id, Product productDetails) {

        return productRepository.findById(id).map(product -> {

            product.setName(productDetails.getName());

            product.setPrice(productDetails.getPrice());

            product.setQuantity(productDetails.getQuantity());

            return productRepository.save(product);
        });
    }

    // Delete product
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}