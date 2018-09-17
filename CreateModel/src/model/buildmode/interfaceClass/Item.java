package model.buildmode.interfaceClass;

import java.math.BigDecimal;

/**
 * @author xiongwu
 **/
public interface Item {

    public String name();
    public Packing packing();
    public BigDecimal price();

}
