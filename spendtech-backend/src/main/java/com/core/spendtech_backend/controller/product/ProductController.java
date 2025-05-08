package com.core.spendtech_backend.controller.product;

import com.core.spendtech_backend.dto.product.ProductDto;
import com.core.spendtech_backend.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/vi/ecom/product/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductDto> getAll(){
        return this.productService.getAll();
    }

    @GetMapping("s/")
    public List<ProductDto> searchProducts(@RequestParam(required = false) String search) {
        if (search != null && !search.isBlank()) {
            return this.productService.searchProducts(search);
        }
        return this.productService.getAll();
    }

    @PostMapping
    public ResponseEntity<?> create(ProductDto productDto){
        return this.productService.create(productDto);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getById(@PathVariable UUID id){
        return this.productService.getById(id);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateById(@PathVariable UUID id,@RequestBody ProductDto productDto){
        return this.productService.updateById(id, productDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteById(@PathVariable UUID id){
        return this.productService.deleteById(id);
    }
}
