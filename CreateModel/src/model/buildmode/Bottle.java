package model.buildmode;

import model.buildmode.interfaceClass.Packing;

/**
 * @author xiongwu
 **/
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "瓶裝";
    }
}
