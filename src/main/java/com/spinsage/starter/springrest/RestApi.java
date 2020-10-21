package com.spinsage.starter.javalinrest;

import io.javalin.Javalin;

public class RestApi {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);
        app.get("/", ctx -> ctx.result("Hello World"));
    }
}
