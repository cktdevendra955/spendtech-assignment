package com.core.spendtech_backend.repo.product;

import com.core.spendtech_backend.entity.product.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, UUID> {

    @Query("SELECT p FROM ProductEntity p WHERE " +
            "LOWER(p.name) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(p.brand) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(p.description) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<ProductEntity> searchProductsByKeyword(@Param("keyword") String keyword);
}
