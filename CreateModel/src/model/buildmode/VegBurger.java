package model.buildmode;

import model.buildmode.abstractClass.AbstractBurger;

import java.math.BigDecimal;

/**
 * @author xiongwu
 **/
public class VegBurger extends AbstractBurger {
    @Override
    public String name() {
        return "素食汉堡";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("30");
    }
}
