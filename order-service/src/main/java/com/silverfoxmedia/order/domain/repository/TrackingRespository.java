package com.silverfoxmedia.order.domain.repository;

import com.silverfoxmedia.order.domain.model.Tracking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TrackingRespository extends JpaRepository<Tracking, Long> {
    List<Tracking> findByPaymentId(Long paymentId);
    Optional<Tracking> findByIdAndPaymentId(Long id, Long paymentId);
}
