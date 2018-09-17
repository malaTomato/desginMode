package model.buildmode.abstractClass;

import model.buildmode.interfaceClass.Item;
import model.buildmode.interfaceClass.Packing;
import model.buildmode.Wrapper;

import java.math.BigDecimal;

/**
 * @author xiongwu
 **/
public abstract class AbstractBurger implements Item {

    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("0");
    }
}
