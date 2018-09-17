package model.abstractfactory;

/**
 * @author xiongwu
 **/
public class ProduceFactory {

    public static void main(String[] args) {

        AbstractFactory color = FactoryProducer.getFactory("color");
        Color blue = color.getColor("blue");
    }
}
