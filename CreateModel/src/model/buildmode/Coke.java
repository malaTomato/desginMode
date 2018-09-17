package model.buildmode;

import model.buildmode.abstractClass.AbstractColdDrink;

import java.math.BigDecimal;

/**
 * @author xiongwu
 **/
public class Coke extends AbstractColdDrink{
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("10");
    }
}
