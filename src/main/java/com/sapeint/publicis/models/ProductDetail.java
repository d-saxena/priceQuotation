package com.sapeint.publicis.models;

public class ProductDetail {

    Long productID;
    int quantity;
    Float price;

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public ProductDetail(Long productID, int quantity, Float price) {
        this.productID = productID;
        this.quantity = quantity;
        this.price = price;
    }
}
