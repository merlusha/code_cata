package com.merlusha.cata_1;

import java.math.BigDecimal;

/**
 * Created by mikalai on 01.11.15.
 */
public class Quantity {
    private BigDecimal number;
    private Unit unit;

    public Quantity(Unit unit, BigDecimal number){
        this.unit=unit;
        this.number=number;
    }
    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
