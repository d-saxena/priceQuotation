package com.sapeint.publicis.models;

import java.util.List;

public class ProductQuatationRequest {

    ShippingAddress shippingAddress;
    String customerID;
    List<Product> products;

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public ProductQuatationRequest(ShippingAddress shippingAddress, String customerID, List<Product> products) {
        this.shippingAddress = shippingAddress;
        this.customerID = customerID;
        this.products = products;
    }
}

