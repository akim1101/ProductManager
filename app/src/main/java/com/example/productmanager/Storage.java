package com.example.productmanager;

public class Storage {
    private static Product[] products = new Product[1000];
    private static int index = 0;
    public static void addProduct(Product product){
        products[index] = new Product(product.getProductName(), product.getProductDate(), product.getProductCount(), product.getProductPrice());
        index++;
    }

    public static Product[] getProducts() {
        return products;
    }
}
