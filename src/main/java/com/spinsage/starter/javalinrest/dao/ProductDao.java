package com.spinsage.starter.javalinrest.dao;

import com.spinsage.starter.javalinrest.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    List<Product> products = new ArrayList<>();
    private static ProductDao dao;
    public static ProductDao instance() {
        if (dao == null) {
            dao = new ProductDao();
        }
        return dao;
    }

    public ProductDao() {
        products.add(Product.Builder().name("Test1").description("Desc1").amount(20.00).build());
        products.add(Product.Builder().name("Test2").description("Desc2").amount(10.00).build());
    }

    public List<Product> getAllProducts() {
        return products;
    }
}
