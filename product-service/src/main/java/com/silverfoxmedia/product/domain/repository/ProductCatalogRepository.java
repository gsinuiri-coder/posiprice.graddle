package com.silverfoxmedia.product.domain.repository;

import com.silverfoxmedia.product.domain.model.ProductCatalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCatalogRepository extends JpaRepository<ProductCatalog, Long> {
}
