package com.core.spendtech_backend.dto.product;

import com.core.spendtech_backend.entity.product.ProductEntity;
import org.springframework.beans.BeanUtils;

public class ProductUtils {
    private ProductUtils(){}

    public static ProductDto ENTITY_TO_DTO(ProductEntity productEntity){
        ProductDto productDto =new ProductDto();
        BeanUtils.copyProperties(productEntity,productDto);
        return productDto;
    }

    public static ProductEntity DTO_TO_ENTITY(ProductDto productDto){
        ProductEntity productEntity = new ProductEntity();
        BeanUtils.copyProperties(productDto,productEntity);
        return productEntity;
    }
}
