package com.epam.pool.task9_chain_of_responsibility.filters;

import com.epam.pool.task9_chain_of_responsibility.Payment;

import java.math.BigDecimal;

public class TaxesFilter extends PaymentFilter {

    private static final BigDecimal commission = new BigDecimal("0.001");

    public TaxesFilter(int type) {
        this.type = type;
    }

    @Override
    void doFilter(Payment payment) {
        System.out.println("taxes filter for " + payment.toString());
        payment.setTotal(payment.getTotal().add(commission.multiply(payment.getSum())));
    }

}
