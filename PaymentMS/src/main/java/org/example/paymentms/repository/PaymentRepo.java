package org.example.paymentms.repository;

import org.example.paymentms.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment, Long> {
}
