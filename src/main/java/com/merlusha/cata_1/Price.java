package com.merlusha.cata_1;

/**
 * Created by mikalai on 01.11.15.
 */
public class Price {
    private Product product;
    private Quantity quatity;
    private Money price;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Quantity getQuatity() {
        return quatity;
    }

    public void setQuatity(Quantity quatity) {
        this.quatity = quatity;
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }
}
