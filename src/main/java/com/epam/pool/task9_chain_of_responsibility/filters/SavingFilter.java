package com.epam.pool.task9_chain_of_responsibility.filters;

import com.epam.pool.task9_chain_of_responsibility.Payment;

public class SavingFilter extends PaymentFilter {

    public SavingFilter(int type) {
        this.type = type;
    }

    @Override
    void doFilter(Payment payment) {
        //saving this transaction to bank db
        System.out.println("saving: " + payment.toString());
    }
}
