package model.buildmode.abstractClass;

import model.buildmode.Bottle;
import model.buildmode.interfaceClass.Item;
import model.buildmode.interfaceClass.Packing;

import java.math.BigDecimal;

/**
 * @author xiongwu
 **/
public abstract class AbstractColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("0");
    }
}
