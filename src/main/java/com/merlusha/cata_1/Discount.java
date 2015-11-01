package com.merlusha.cata_1;

/**
 * Created by mikalai on 01.11.15.
 */
public class Discount {
    private Quantity normalQuantity;
    private Quantity discountedQuantity;

    public Quantity getNormalQuantity() {
        return normalQuantity;
    }

    public void setNormalQuantity(Quantity normalQuantity) {
        this.normalQuantity = normalQuantity;
    }

    public Quantity getDiscountedQuantity() {
        return discountedQuantity;
    }

    public void setDiscountedQuantity(Quantity discountedQuantity) {
        this.discountedQuantity = discountedQuantity;
    }
}
