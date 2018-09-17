package model.buildmode;

import model.buildmode.abstractClass.AbstractBurger;

import java.math.BigDecimal;

/**
 * @author xiongwu
 **/
public class ChickenBurger extends AbstractBurger {

    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("40");
    }
}
