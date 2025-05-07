package com.core.spendtech_backend.service.impl.product;

import com.core.spendtech_backend.dto.product.ProductDto;
import com.core.spendtech_backend.dto.product.ProductUtils;
import com.core.spendtech_backend.entity.product.ProductEntity;
import com.core.spendtech_backend.repo.product.ProductRepo;
import com.core.spendtech_backend.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<ProductDto> getAll() {
        List<ProductEntity> list = this.productRepo.findAll();
        List<ProductDto>  productList =  list.stream().map(product -> ProductUtils.ENTITY_TO_DTO(product)).collect(Collectors.toList());
        return productList;
    }

    @Override
    public ResponseEntity<?> create(ProductDto productDto) {
        try {
            productDto.setCreatedAt(new Date());
            ProductEntity saved = this.productRepo.save(ProductUtils.DTO_TO_ENTITY(productDto));
            return new ResponseEntity<ProductDto>(ProductUtils.ENTITY_TO_DTO(saved), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(Map.of("Message","Bad Request"), HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<?> getById(UUID id) {
        Optional<ProductEntity> product = this.productRepo.findById(id);
        if (product.isPresent()){
            return new ResponseEntity<ProductDto>(ProductUtils.ENTITY_TO_DTO(product.get()), HttpStatus.CREATED);
        }else {
            return new ResponseEntity<>(Map.of("Message","DATA NOT FOUND"), HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<?> updateById(UUID id, ProductDto productDto) {
        Optional<ProductEntity> product = this.productRepo.findById(id);
        if (product.isPresent()){
            try{
                ProductEntity data = product.get();
                data.setName(productDto.getName());
                data.setDescription(productDto.getDescription());
                data.setBrand(productDto.getBrand());
                data.setPrice(productDto.getPrice());
                data.setImageUrl(productDto.getImageUrl());
                data.setCategory(productDto.getCategory());
                data.setUpdatedAt(new Date());
                ProductEntity saved = this.productRepo.save(data);
                return new ResponseEntity<ProductDto>(ProductUtils.ENTITY_TO_DTO(saved), HttpStatus.CREATED);

            } catch (Exception e) {
                return new ResponseEntity<>(Map.of("Message",e.getMessage()), HttpStatus.BAD_REQUEST);
            }

        }else {
            return new ResponseEntity<>(Map.of("Message","DATA NOT FOUND"), HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<?> deleteById(UUID id) {
        Optional<ProductEntity> product = this.productRepo.findById(id);
        if (product.isPresent()){
            this.productRepo.deleteById(id);
            return new ResponseEntity<>(Map.of("Message","1 ROW DELETED"), HttpStatus.CREATED);
        }else {
            return new ResponseEntity<>(Map.of("Message","DATA NOT FOUND"), HttpStatus.NOT_FOUND);
        }
    }
}
