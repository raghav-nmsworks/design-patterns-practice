package org.learning.creational.singleton.eager;


//this is serialized singleton
//enum is thread safe
//enum is safe from reflection
public enum EnumSingleton {
    SINGLETON;

    public static void doStuff(){
        System.out.println("This is ENUM Singleton");
    }
}
