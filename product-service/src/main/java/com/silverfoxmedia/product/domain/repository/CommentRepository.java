package com.silverfoxmedia.product.domain.repository;

import com.silverfoxmedia.product.domain.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByProductCatalogId(Long productCatalogId);
    Optional<Comment> findByIdAndProductCatalogId(Long id, Long productCatalogId);
}
