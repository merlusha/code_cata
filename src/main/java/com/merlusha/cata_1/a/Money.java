package com.merlusha.cata_1.a;

import java.math.BigDecimal;

/**
 * Created by mikalai on 01.11.15.
 */
public class Money {
    private BigDecimal amount=BigDecimal.ZERO;
    private String currency;

    public Money(String currency,BigDecimal amount){
        this.currency=currency;
        this.amount=amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return amount.toPlainString()+" "+ currency;
    }
}
