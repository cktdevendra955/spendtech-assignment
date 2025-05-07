package com.core.spendtech_backend.repo.product;

import com.core.spendtech_backend.entity.product.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, UUID> {
}
