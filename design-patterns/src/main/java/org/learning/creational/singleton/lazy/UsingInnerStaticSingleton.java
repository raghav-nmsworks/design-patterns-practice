package org.learning.creational.singleton.lazy;

public class UsingInnerStaticSingleton {
    private UsingInnerStaticSingleton(){
    }

    private static class Singleton{
        private static final UsingInnerStaticSingleton INSTANCE = new UsingInnerStaticSingleton();
    }
    public static UsingInnerStaticSingleton getInstance(){
        return Singleton.INSTANCE;
    }
}
