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

    public static Money calculatePriceWithDiscount(Price price,Discount discount,Quantity quantity){
        BigDecimal initialAmount = quantity.getNumber();
        BigDecimal minimalDiscountedAmount = discount.getNormalQuantity().getNumber();
        if(initialAmount.compareTo(minimalDiscountedAmount)>=1){
            BigDecimal discountedAmount = discount.getDiscountedQuantity().getNumber();
            BigDecimal freeAmount = initialAmount.divide(minimalDiscountedAmount,0,BigDecimal.ROUND_DOWN);
            BigDecimal toPayAmount = initialAmount.subtract(freeAmount);
            BigDecimal toPay = toPayAmount.multiply(price.getPrice().getAmount());
            return new Money(price.getPrice().getCurrency(),toPay);

        }else{
            return calculatePrice(price,quantity);
        }

    }
}
