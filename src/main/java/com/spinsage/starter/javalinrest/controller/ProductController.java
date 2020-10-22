package com.spinsage.starter.javalinrest.controller;

import com.spinsage.starter.javalinrest.dao.ProductDao;
import com.spinsage.starter.javalinrest.model.Product;
import io.javalin.http.Handler;

import java.util.List;

public class ProductController {

    private ProductDao productDao = ProductDao.instance();

    public Handler getAllProducts = ctx -> {
        List<Product> products = productDao.getAllProducts();
        ctx.json(products);
    };
}
