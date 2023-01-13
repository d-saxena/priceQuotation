package com.sapeint.publicis.models;

import java.util.List;

public class ProductQuatationResponse {

    ShippingAddress shippingAddress;
    String customerID;
    List<ProductDetail> productsDetail;

    public ProductQuatationResponse(ShippingAddress shippingAddress, String customerID, List<ProductDetail> productsDetail) {
        this.shippingAddress = shippingAddress;
        this.customerID = customerID;
        this.productsDetail = productsDetail;
    }

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

    public List<ProductDetail> getProductsDetail() {
        return productsDetail;
    }

    public void setProductsDetail(List<ProductDetail> productsDetail) {
        this.productsDetail = productsDetail;
    }
}
