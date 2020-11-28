package com.silverfoxmedia.order.domain.service;

import com.silverfoxmedia.order.domain.model.Tracking;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TrackingService {
    List<Tracking> getAllTrackingsByPaymentId(Long paymentId);
    Tracking getTrackingByIdAndPaymentId(Long paymentId, Long trackingId);
    Tracking createTracking(Long paymentId, Tracking tracking);
    Tracking updateTracking(Long paymentId, Long trackingId, Tracking trackingDetails);
    ResponseEntity<?> deleteTracking(Long paymentId, Long trackingId);
}
