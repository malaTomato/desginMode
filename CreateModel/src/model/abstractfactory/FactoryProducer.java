package model.abstractfactory;

/**
 * @author xiongwu
 **/
public class FactoryProducer {

    private static String SHAPE = "shape";
    private static String COLOR = "color";

    public static AbstractFactory getFactory(String choice) {

        if(SHAPE.equals(choice)){
            return new ShapeFactory();
        }

        if(COLOR.equals(choice)){
            return new ColorFactory();
        }

        return null;
    }
}
