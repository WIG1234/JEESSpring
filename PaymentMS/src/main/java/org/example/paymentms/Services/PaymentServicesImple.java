package org.example.paymentms.Services;

import org.example.paymentms.entity.Payment;

import java.util.List;

public interface PaymentServicesImple {
    public void CreatePayment(Payment p);
    public Payment GetPayment(Long id);
    public List<Payment> GetAllPayments();
}
