package com.core.spendtech_backend.entity.product;

import com.core.spendtech_backend.entity.BaseEntity;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "ecom_product")
public class ProductEntity extends BaseEntity {


    @Column(nullable = false)
    private String name;
    private String description;
    private BigDecimal price;
    private String brand;

    @Enumerated(EnumType.STRING)
    private Category category;
    private String imageUrl;
    public enum Category {
        ELECTRONICS, FASHION, BOOKS
    }

    public ProductEntity() {
    }

    public ProductEntity(String name, String description, BigDecimal price, String brand, Category category, String imageUrl) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
