package com.silverfoxmedia.product.domain.service;

import com.silverfoxmedia.product.domain.model.Comment;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CommentService {
    List<Comment> getAllCommentsByProductCatalogId(Long productCatalogId);
    Comment getCommentByIdAndProductCatalogId(Long productCatalogId, Long commentId);
    Comment createComment(Long productCatalogId, Comment comment);
    Comment updateComment(Long productCatalogId, Long commentId, Comment commentDetails);
    ResponseEntity<?> deleteComment(Long productCatalogId, Long commentId);
}
