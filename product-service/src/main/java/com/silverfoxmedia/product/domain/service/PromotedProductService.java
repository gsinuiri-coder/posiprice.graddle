package com.silverfoxmedia.product.domain.service;

import com.silverfoxmedia.product.domain.model.PromotedProduct;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PromotedProductService {
    List<PromotedProduct> getAllPromotedProducts();
    PromotedProduct getPromotedProductById(Long promotedProductId);
    PromotedProduct createPromotedProduct(PromotedProduct promotedProduct);
    PromotedProduct updatePromotedProduct(Long promotedProductId, PromotedProduct promotedProductRequest);
    ResponseEntity<?> deletePromotedProduct(Long promotedProductId);
}
