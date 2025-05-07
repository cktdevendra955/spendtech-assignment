package com.core.spendtech_backend.dto.product;

import com.core.spendtech_backend.dto.BaseDto;
import com.core.spendtech_backend.entity.product.ProductEntity;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductDto extends BaseDto {


    private String name;
    private String description;
    private BigDecimal price;
    private String brand;
    private ProductEntity.Category category;
    private String imageUrl;

    public ProductDto() {
    }

    public ProductDto(String name, String description, BigDecimal price, String brand, ProductEntity.Category category, String imageUrl) {
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

    public ProductEntity.Category getCategory() {
        return category;
    }

    public void setCategory(ProductEntity.Category category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
