package com.silverfoxmedia.product.domain.service;

import com.silverfoxmedia.product.domain.model.ProductCatalog;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductCatalogService {
    List<ProductCatalog> getAllProductCatalogs();
    ProductCatalog getProductCatalogById(Long productCatalogId);
    ProductCatalog createProductCatalog(ProductCatalog productCatalog);
    ProductCatalog updateProductCatalog(Long productCatalogId, ProductCatalog productCatalogRequest);
    ResponseEntity<?> deleteProductCatalog(Long productCatalogId);
}
