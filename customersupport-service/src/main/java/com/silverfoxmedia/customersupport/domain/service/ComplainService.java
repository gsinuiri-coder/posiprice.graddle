package com.silverfoxmedia.customersupport.domain.service;

import com.silverfoxmedia.customersupport.domain.model.Complain;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ComplainService {
    List<Complain> getAllComplainsByUserId(Long userId);
    Complain getComplainByIdAndUserId(Long userId, Long commentId);
    Complain createComplain(Long userId, Complain comment);
    Complain updateComplain(Long userId, Long commentId, Complain commentDetails);
    ResponseEntity<?> deleteComplain(Long userId, Long commentId);
}
