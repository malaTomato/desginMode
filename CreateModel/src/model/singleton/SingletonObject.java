package model.singleton;

/**
 * @author xiongwu
 **/
public class SingletonObject {

    private static SingletonObject singletonObject = new SingletonObject();

    public static SingletonObject getSingleton() {
        return singletonObject;
    }

    private SingletonObject() {
    }
}
