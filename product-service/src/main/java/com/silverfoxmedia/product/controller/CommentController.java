package com.silverfoxmedia.product.controller;

import com.silverfoxmedia.product.domain.model.Comment;
import com.silverfoxmedia.product.domain.service.CommentService;
import com.silverfoxmedia.product.resource.CommentResource;
import com.silverfoxmedia.product.resource.SaveCommentResource;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@Tag(name = "Comments", description = "Comments API")
@RestController
@RequestMapping("/api")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private ModelMapper mapper;

    @GetMapping("/productCatalogs/{productCatalogId}/comments")
    public List<CommentResource> getAllCommentsByProductCatalogId(@PathVariable (value = "productCatalogId") Long productCatalogId) {
        return commentService.getAllCommentsByProductCatalogId(productCatalogId)
                .stream().map(this::convertToResource)
                .collect(Collectors.toList());
    }

    @GetMapping("/productCatalogs/{productCatalogId}/comments/{commentId}")
    public CommentResource getCommentByIdAndProductCatalogId(
            @PathVariable(name = "productCatalogId") Long productCatalogId,
            @PathVariable(name = "commentId") Long commentId) {
        return convertToResource(commentService.getCommentByIdAndProductCatalogId(productCatalogId, commentId));
    }

    @PostMapping("/productCatalogs/{productCatalogId}/comments")
    public CommentResource createComment(
            @PathVariable(value = "productCatalogId") Long productCatalogId,
            @Valid @RequestBody SaveCommentResource resource) {
        return convertToResource(commentService.createComment(productCatalogId,
                convertToEntity(resource)));
    }

    @PutMapping("/productCatalogs/{productCatalogId}/comments/{commentId}")
    public CommentResource updateComment(
            @PathVariable (value = "productCatalogId") Long productCatalogId,
            @PathVariable (value = "commentId") Long commentId,
            @Valid @RequestBody SaveCommentResource resource) {
        return convertToResource(commentService.updateComment(productCatalogId, commentId,
                convertToEntity(resource)));
    }

    @DeleteMapping("/productCatalogs/{productCatalogId}/comments/{commentId}")
    public ResponseEntity<?> deleteComment(
            @PathVariable (value = "productCatalogId") Long productCatalogId,
            @PathVariable (value = "commentId") Long commentId) {
        return commentService.deleteComment(productCatalogId, commentId);
    }

    private Comment convertToEntity(SaveCommentResource resource) {
        return mapper.map(resource, Comment.class);
    }
    private CommentResource convertToResource(Comment entity) {
        return mapper.map(entity, CommentResource.class);
    }
}
