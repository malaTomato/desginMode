package model.factory;

/**
 * @author xiongwu
 **/
public class ShapeFactory {

    private static final String CIRCLE ="Circle";
    private static final String RECTANGLE = "Rectangle";

    public static Shape getShape(String shape){
        if(shape.equals(CIRCLE)){
            return new Circle();
        }
        if(shape.equals(RECTANGLE)){
            return new Rectangle();
        }
        return null;
    }


    public static void main(String[] args) {

        Shape shape = ShapeFactory.getShape("Circle");
        shape.draw();
    }
}
