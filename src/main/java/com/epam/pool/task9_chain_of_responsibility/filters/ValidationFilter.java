package com.epam.pool.task9_chain_of_responsibility.filters;

import com.epam.pool.task9_chain_of_responsibility.Payment;

public class ValidationFilter extends PaymentFilter {

    public ValidationFilter(int type) {
        this.type = type;
    }

    @Override
    void doFilter(Payment payment) {
        System.out.println("validation filter for " + payment);
        if (payment == null
                || payment.getTotal() == null
                || payment.getSum() == null
                || payment.getFrom() < 0
                || payment.getTo() < 0) {
            throw new IllegalArgumentException("Can not perform such payment");
        }
    }
}
