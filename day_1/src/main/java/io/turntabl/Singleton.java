package io.turntabl;

public class Singleton {
    private String name = "Addo";
    private static Singleton singletonInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if(singletonInstance != null) {
            return singletonInstance;
        }
        singletonInstance = new Singleton();
        return singletonInstance;
    }
}
