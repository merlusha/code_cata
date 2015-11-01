package com.merlusha.cata_1;

import java.math.BigDecimal;

/**
 * Created by mikalai on 01.11.15.
 */
public class PriceCalculator {
    public static Money calculatePrice(Price price,Quantity quantity){
        BigDecimal amount = price.getPrice().getAmount();
        BigDecimal toPay = quantity.getNumber().multiply(amount);
        return new Money(price.getPrice().getCurrency(),toPay);
    }
}
