package ru.kirill.searchrestapi.service;

import ru.kirill.searchrestapi.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
