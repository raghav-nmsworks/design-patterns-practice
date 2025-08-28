package org.learning.creational.Builder.builderInSameClass;

import org.learning.creational.Builder.builderInSameClass.Mobile;

public class BuilderPatternImplementation {
    public static void main(String[] args) {
        Mobile mobile = new Mobile.Builder()
                .memory("128GB")
                .battery("5000mAh")
                .wireless("5G")
                .screen("6.5")
                .metalCase("Stainless Steel")
                .build();

        System.out.println(mobile);

        Mobile mobile2 = Mobile.builder()
                .memory("128GB")
                .battery("5000mAh")
                .wireless("5G")
                .screen("6.5")
                .metalCase("Stainless Steel")
                .build();

        System.out.println(mobile2);
    }
}
