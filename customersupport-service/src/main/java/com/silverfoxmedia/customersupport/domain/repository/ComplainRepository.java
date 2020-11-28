package com.silverfoxmedia.customersupport.domain.repository;

import com.silverfoxmedia.customersupport.domain.model.Complain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface ComplainRepository extends JpaRepository<Complain, Long> {
        List<Complain> findByUserId(Long userId);
        Optional<Complain> findByIdAndUserId(Long id, Long userId);
        }
