package com.spinsage.starter.javalinrest;

import com.spinsage.starter.javalinrest.controller.ProductController;
import io.javalin.Javalin;
import static io.javalin.apibuilder.ApiBuilder.*;

public class RestApi {
    public static void main(String[] args) {
        ProductController productController =  new ProductController();

        Javalin app = Javalin.create().start(7000);
        app.get("/product", productController.getAllProducts);
    }
}
