package com.silverfoxmedia.collectivity.domain.service;

import com.silverfoxmedia.collectivity.domain.model.VoteProductCatalog;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface VoteProductCatalogService {
    List<VoteProductCatalog> getAllVoteProductCatalogs();
    VoteProductCatalog getVoteProductCatalogById(Long voteProductCatalogId);
    VoteProductCatalog createVoteProductCatalog(VoteProductCatalog voteProductCatalog);
    VoteProductCatalog updateVoteProductCatalog(Long voteProductCatalogId, VoteProductCatalog voteProductCatalogRequest);
    ResponseEntity<?> deleteVoteProductCatalog(Long voteProductCatalogId);

//    VoteProductCatalog assignVoteProductCatalogTag(Long voteProductCatalogId, Long tagId);
//    VoteProductCatalog unassignVoteProductCatalogTag(Long voteProductCatalogId, Long tagId);
}
