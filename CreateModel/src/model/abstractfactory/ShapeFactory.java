package model.abstractfactory;

/**
 * @author xiongwu
 **/
public class ShapeFactory extends AbstactFactory{

    private static final String CIRCLE ="Circle";
    private static final String RECTANGLE = "Rectangle";

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape){
        if(shape.equals(CIRCLE)){
            return new Circle();
        }
        if(shape.equals(RECTANGLE)){
            return new Rectangle();
        }
        return null;
    }

}
