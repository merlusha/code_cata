package com.merlusha.cata_1;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by mikalai on 01.11.15.
 */
public class PriceTest {

    @Test
    public void test_price_calculation(){
        Product product = new Product("beans");
        Unit unit = new Unit ("kg");
        Quantity quatity = new Quantity(unit, BigDecimal.ONE);
        Money money =new Money("EUR",BigDecimal.valueOf(5));
        Price price = new Price();
        price.setProduct(product);
        price.setPrice(money);
        price.setQuantity(quatity);

        Quantity buingQuantity = new Quantity(unit,new BigDecimal("0.1"));

        System.out.println(PriceCalculator.calculatePrice(price, buingQuantity));

    }

    @Test
    public void test_price_discount_calculation(){
        Product product = new Product("beans");
        Unit unit = new Unit ("kg");
        Quantity quatity = new Quantity(unit, BigDecimal.ONE);
        Money money =new Money("EUR",BigDecimal.valueOf(5));
        Price price = new Price();
        price.setProduct(product);
        price.setPrice(money);
        price.setQuantity(quatity);

        Quantity buingQuantity = new Quantity(unit,new BigDecimal("100"));

        Quantity normalAmount = new Quantity(unit, BigDecimal.valueOf(3));
        Quantity discountedAmount = new Quantity(unit, BigDecimal.valueOf(2));
        Discount discount = new Discount();
        discount.setNormalQuantity(normalAmount);
        discount.setDiscountedQuantity(discountedAmount);


        System.out.println(PriceCalculator.calculatePriceWithDiscount(price,discount,buingQuantity));

    }
}
