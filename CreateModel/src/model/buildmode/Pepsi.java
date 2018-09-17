package model.buildmode;

import model.buildmode.abstractClass.AbstractColdDrink;

import java.math.BigDecimal;

/**
 * @author xiongwu
 **/
public class Pepsi extends AbstractColdDrink{
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("10");
    }
}
