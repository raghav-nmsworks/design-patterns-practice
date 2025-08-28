package org.learning.creational.Builder.withSeperateBuilderClass;

public class Manufacturer {
    public static Mobile createCompleteObject(){
        MobileBuilder builder = new ConcreteMobileBuilder();
        return builder.buildMobile();
    }
}
