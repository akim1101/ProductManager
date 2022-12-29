package com.example.productmanager;

public class Product {
    private String productName;
    private String productDate;
    private int productCount;
    private int productPrice;

    public Product(String productName, String productDate, int proudctCount, int proudctPrice) {
        this.productName = productName;
        this.productDate = productDate;
        this.productCount = proudctCount;
        this.productPrice = proudctPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDate() {
        return productDate;
    }

    public void setProductDate(String productDate) {
        this.productDate = productDate;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
}
