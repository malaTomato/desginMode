package model.buildmode;

import model.buildmode.interfaceClass.Packing;

/**
 * @author xiongwu
 **/
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "紙盒包裝";
    }
}
