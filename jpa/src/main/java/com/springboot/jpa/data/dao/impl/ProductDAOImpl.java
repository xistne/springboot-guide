package com.springboot.jpa.data.dao.impl;

import com.springboot.jpa.data.dao.ProductDAO;
import com.springboot.jpa.entity.Product;
import com.springboot.jpa.repository.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class ProductDAOImpl implements ProductDAO {

    private final ProductRepository productRepository;

    @Autowired
    public ProductDAOImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product insertProduct(Product product) {
        Product savedProduct = productRepository.save(product);
        return savedProduct;
    }

    @Override
    public Product selectProduct(Long number) {
        Product selectedProduct = productRepository.findById(number).orElseThrow(() -> new EntityNotFoundException("No product found."));

        return selectedProduct;
    }

    @Override
    public Product updateProductName(Long number, String name) throws Exception {
//        Optional<Product> selectedProduct = productRepository.findById(number);
//
//        Product updatedProduct;
//        if (selectedProduct.isPresent()) {
//            Product product = selectedProduct.get();
//
//            product.setName(name);
//            product.setUpdatedAt(LocalDateTime.now());
//
//            updatedProduct = productRepository.save(product);
//        } else {
//            throw new Exception();
//        }

        return productRepository.findById(number)
                .map(product -> {
                    product.setName(name);
                    product.setUpdatedAt(LocalDateTime.now());
                    return productRepository.save(product);})
                .orElseThrow(() -> new Exception());
    }

    @Override
    public void deleteProduct(Long number) throws Exception {
//        Optional<Product> selectedProduct = productRepository.findById(number);
//
//        if (selectedProduct.isPresent()) {
//            Product product = selectedProduct.get();
//
//            productRepository.delete(product);
//        } else {
//            throw new Exception();
//        }
        productRepository.findById(number)
                .ifPresentOrElse(
                        product -> productRepository.delete(product), // productRepository::delete
                        () -> new Exception());
    }
}
