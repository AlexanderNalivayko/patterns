package com.epam.pool.task9_chain_of_responsibility;

import java.math.BigDecimal;

public class Payment {
    private long from;
    private long to;
    private BigDecimal sum;
    private BigDecimal total;

    public Payment(long from, long to, BigDecimal sum, BigDecimal total) {
        this.from = from;
        this.to = to;
        this.sum = sum;
        this.total = total;
    }

    public long getFrom() {
        return from;
    }

    public void setFrom(long from) {
        this.from = from;
    }

    public long getTo() {
        return to;
    }

    public void setTo(long to) {
        this.to = to;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "payment:" +
                " from=" + from +
                ", to=" + to +
                ", sum=" + sum +
                ", total=" + total;
    }
}
