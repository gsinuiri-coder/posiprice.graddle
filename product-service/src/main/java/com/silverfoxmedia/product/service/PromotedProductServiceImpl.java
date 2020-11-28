package com.silverfoxmedia.product.service;

import com.silverfoxmedia.product.domain.model.PromotedProduct;
import com.silverfoxmedia.product.domain.repository.PromotedProductRepository;
import com.silverfoxmedia.product.domain.service.PromotedProductService;
import com.silverfoxmedia.product.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotedProductServiceImpl implements PromotedProductService {

    @Autowired
    private PromotedProductRepository promotedProductRepository;

    @Override
    public List<PromotedProduct> getAllPromotedProducts() { return promotedProductRepository.findAll(); }

    @Override
    public PromotedProduct getPromotedProductById(Long promotedProductId) {
        return promotedProductRepository.findById(promotedProductId)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "PromotedProduct", "Id", promotedProductId));
    }

    @Override
    public PromotedProduct createPromotedProduct(PromotedProduct promotedProduct) {


        return promotedProductRepository.save(promotedProduct);
    }

    @Override
    public PromotedProduct updatePromotedProduct(Long promotedProductId, PromotedProduct promotedProductRequest) {
        PromotedProduct promotedProduct = promotedProductRepository.findById(promotedProductId)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "PromotedProduct", "Id", promotedProductId));

        promotedProduct.setName(promotedProductRequest.getName());

        return promotedProductRepository.save(promotedProduct);
    }

    @Override
    public ResponseEntity<?> deletePromotedProduct(Long promotedProductId) {
        PromotedProduct promotedProduct = promotedProductRepository.findById(promotedProductId)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "PromotedProduct", "Id", promotedProductId));
        promotedProductRepository.delete(promotedProduct);
        return ResponseEntity.ok().build();
    }
}
