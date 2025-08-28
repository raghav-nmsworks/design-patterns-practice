package org.learning.creational.Builder.withSeperateBuilderClass;

public class BuilderDesignPattern {
    public static void main(String[] args) {
        Mobile mobile = Manufacturer.createCompleteObject();
        System.out.println(mobile);
    }
}
