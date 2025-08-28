package org.learning.creational.Builder.builderInSameClass;

public class Mobile {
    private String memory;
    private String battery;
    private String wireless;
    private String screen;
    private String metalCase;

    // private constructor
    private Mobile(Builder builder) {
        this.memory = builder.memory;
        this.battery = builder.battery;
        this.wireless = builder.wireless;
        this.screen = builder.screen;
        this.metalCase = builder.metalCase;
    }

    // ✅ Static factory method for convenience
    public static Builder builder() {
        return new Builder();
    }

    // Static inner Builder
    public static class Builder {
        private String memory;
        private String battery;
        private String wireless;
        private String screen;
        private String metalCase;

        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder battery(String battery) {
            this.battery = battery;
            return this;
        }

        public Builder wireless(String wireless) {
            this.wireless = wireless;
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder metalCase(String metalCase) {
            this.metalCase = metalCase;
            return this;
        }

        public Mobile build() {
            return new Mobile(this);
        }
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "memory='" + memory + '\'' +
                ", battery='" + battery + '\'' +
                ", wireless='" + wireless + '\'' +
                ", screen='" + screen + '\'' +
                ", metalCase='" + metalCase + '\'' +
                '}';
    }
}

