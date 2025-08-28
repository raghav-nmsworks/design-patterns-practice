package org.learning.creational.singleton.eager;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonDesignPatternEager {
    public static void main(String[] args) throws Exception { //IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        EagerSingleton instance = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();
        System.out.println(instance == instance2);

        saveToFile(instance, "singleton.bin");
        instance.setValue(20);
        EagerSingleton instance3 = readFromFile("singleton.bin");

        System.out.println(instance.getValue());
        System.out.println(instance3.getValue());
        //values are not same in instance and instance3, so we have two instances of singleton
        //to resolve this we added read resolve method in EagerSingleton class

        Constructor constructor = EagerSingleton.class.getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);
        EagerSingleton instance4 = (EagerSingleton) constructor.newInstance();
        System.out.println(instance == instance4); //false
        //one more problem, if we user reflection to create instance of singleton, it will create new instance
        //to resolve this we added private constructor in EagerSingleton class

        EnumSingleton enumSingleton = EnumSingleton.SINGLETON;
        enumSingleton.doStuff();
    }

    static void saveToFile(EagerSingleton singleton, String fileName) throws IOException {
        try(FileOutputStream fout = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fout)){
                out.writeObject(singleton);
            }
    }
    static EagerSingleton readFromFile(String fileName) throws IOException, ClassNotFoundException {
        try(FileInputStream fin = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fin)){
            return (EagerSingleton) in.readObject();
        }
    }

}
