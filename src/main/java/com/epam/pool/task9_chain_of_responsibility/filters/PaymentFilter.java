package com.epam.pool.task9_chain_of_responsibility.filters;

import com.epam.pool.task9_chain_of_responsibility.Payment;

public abstract class PaymentFilter {
    public static int BANK = 3;
    public static int WITH_TAXES = 5;
    public static int WITH_COMMISSIONS_AND_TAXES = 7;

    protected int type;

    protected PaymentFilter nextFilter;

    public PaymentFilter setNext(PaymentFilter nexFilter) {
        this.nextFilter = nexFilter;
        return this;
    }

    public void filter(Payment payment, int type) {
        if (this.type <= type) {
            doFilter(payment);
        }
        if (nextFilter != null) {
            nextFilter.filter(payment, type);
        }
    }

    abstract void doFilter(Payment payment);
}
