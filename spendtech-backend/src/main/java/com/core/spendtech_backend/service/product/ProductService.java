package com.core.spendtech_backend.service.product;

import com.core.spendtech_backend.dto.product.ProductDto;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface ProductService {

    List<ProductDto> getAll();
    ResponseEntity<?> create(ProductDto productDto);
    ResponseEntity<?> getById(UUID id);
    ResponseEntity<?> updateById(UUID id, ProductDto productDto);
    ResponseEntity<?> deleteById(UUID id);

}
