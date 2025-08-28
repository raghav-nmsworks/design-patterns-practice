package org.learning.creational.singleton.eager.staticSingleton;

public class StaticEagerSingleton {
    private static StaticEagerSingleton instance;

    private StaticEagerSingleton(){}

    static {
        try {
            instance = new StaticEagerSingleton();
        }catch (Exception e){
            throw new RuntimeException("Exception in creating singleton instance");
        }
    }

    public static StaticEagerSingleton getInstance(){
        return instance;
    }
}
