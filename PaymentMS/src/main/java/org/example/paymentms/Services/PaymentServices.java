package org.example.paymentms.Services;

import org.example.paymentms.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PaymentServices implements PaymentServicesImple{


    @Override
    public void CreatePayment(Payment p) {

    }

    @Override
    public Payment GetPayment(Long id) {
        return null;
    }

    @Override
    public List<Payment> GetAllPayments() {
        return List.of();
    }
}
