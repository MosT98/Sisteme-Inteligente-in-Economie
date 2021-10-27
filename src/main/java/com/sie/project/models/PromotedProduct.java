package com.sie.project.models;

import com.sie.project.enums.ProductCategory;

import java.time.Instant;
import java.util.Date;

public class PromotedProduct {

    public ProductCategory category;
    public Double discount;
    public Instant expirationDate;
    public String name;

    public PromotedProduct(ProductCategory category, Double discount, Instant expirationDate, String name) {
        this.category = category;
        this.discount = discount;
        this.expirationDate = expirationDate;
        this.name = name;
    }

    public PromotedProduct(Instant expirationDate) {
        this.expirationDate = expirationDate;
    }

    public PromotedProduct(String name) {
        this.name = name;
    }

    public PromotedProduct(ProductCategory category, Instant expirationDate, String name) {
        this.category = category;
        this.expirationDate = expirationDate;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Instant getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Instant expirationDate) {
        this.expirationDate = expirationDate;
    }
}
