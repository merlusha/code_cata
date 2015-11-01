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
        Quatity quatity = new Quatity(unit, BigDecimal.ONE);
        Money money =new Money("EUR",BigDecimal.valueOf(5));
        Price price = new Price();
        price.setProduct(product);
        price.setPrice(money);
        price.setQuatity(quatity);

        Quatity buingQuantity = new Quatity(unit,BigDecimal.TEN);

        System.out.println(PriceCalculator.calculatePrice(price,buingQuantity));
    }
}
