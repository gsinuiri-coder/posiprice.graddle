package com.silverfoxmedia.order.domain.service;

import com.silverfoxmedia.order.domain.model.Payment;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PaymentService {
    List<Payment> getAllPayments();
    Payment getPaymentById(Long paymentId);
    Payment createPayment(Payment payment);
    Payment updatePayment(Long paymentId, Payment paymentRequest);
    ResponseEntity<?> deletePayment(Long paymentId);
}
