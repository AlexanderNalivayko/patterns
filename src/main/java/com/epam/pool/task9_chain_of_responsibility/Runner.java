package com.epam.pool.task9_chain_of_responsibility;

import com.epam.pool.task9_chain_of_responsibility.filters.*;

import java.math.BigDecimal;

import static com.epam.pool.task9_chain_of_responsibility.filters.PaymentFilter.*;

public class Runner {

    public static void main(String[] args) {

        PaymentFilter filter1 = new ValidationFilter(BANK);
        PaymentFilter filter2 = new TaxesFilter(WITH_TAXES);
        PaymentFilter filter3 = new CommissionFilter(WITH_COMMISSIONS_AND_TAXES);
        PaymentFilter filter4 = new SavingFilter(BANK);

        PaymentFilter filterChain = filter1.setNext(filter2.setNext(filter3.setNext(filter4)));

        Payment innerBankPayment = new Payment(1,2, new BigDecimal(100), new BigDecimal(0));
        Payment govPayment = new Payment(1,777, new BigDecimal(100), new BigDecimal(0));
        Payment externalPayment = new Payment(1,8008135, new BigDecimal(100), new BigDecimal(0));

        filterChain.filter(innerBankPayment, BANK);

        System.out.println("\n====================\n");

        filterChain.filter(govPayment, WITH_TAXES);

        System.out.println("\n====================\n");

        filterChain.filter(externalPayment, WITH_COMMISSIONS_AND_TAXES);

    }
}
