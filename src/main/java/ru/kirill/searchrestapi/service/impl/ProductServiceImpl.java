package ru.kirill.searchrestapi.service.impl;

import org.springframework.stereotype.Service;
import ru.kirill.searchrestapi.entity.Product;
import ru.kirill.searchrestapi.repository.ProductRepository;
import ru.kirill.searchrestapi.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {
        List<Product> products = productRepository.searchProducts(query);
        return products;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
