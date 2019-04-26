package com.epam.pool.task9_chain_of_responsibility.filters;

import com.epam.pool.task9_chain_of_responsibility.Payment;

import java.math.BigDecimal;

public class CommissionFilter extends PaymentFilter {
    private static final BigDecimal commission = new BigDecimal("0.005");

    public CommissionFilter(int type) {
        this.type = type;
    }

    @Override
    void doFilter(Payment payment) {
        System.out.println("commission filter for " + payment.toString());
        payment.setTotal(payment.getTotal().add(commission.multiply(payment.getSum())));
    }
}
