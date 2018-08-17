package model.abstractfactory;

/**
 * @author xiongwu
 **/
public class ColorFactory extends AbstactFactory{

    private static final String BLUE = "blue";
    private static final String RED = "red";

    @Override
    public Color getColor(String color){
        if(color.equals(BLUE)){
            return new Blue();
        }
        if(color.equals(RED)){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
