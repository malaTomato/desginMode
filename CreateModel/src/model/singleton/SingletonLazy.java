package model.singleton;

/**
 * lazy mode
 * 1.not thread safe
 * 2.not support multiple thread
 * 3.lazy initial
 *
 * @author xiongwu
 **/
public class SingletonLazy {

    private static SingletonLazy singletonLazy;

    public static SingletonLazy getSingletonLazy() {
        if (singletonLazy != null) {
            return singletonLazy;
        }
        return new SingletonLazy();
    }

    private SingletonLazy(){

    }
}
