package org.learning.creational.singleton.eager;

import java.io.Serializable;

public class EagerSingleton implements Serializable {

    //we can put this field as public static final, is we don't want to use getInstance() method
    private static final EagerSingleton instance = new EagerSingleton();
    private int value;
    private EagerSingleton() {
        System.out.println("singleton instance created");
        value = 10;
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
/*🔹 Why No Multithreading Issues?
Class loading in Java is thread-safe (guaranteed by the JVM spec).
The INSTANCE is created at class loading time, before any thread can access getInstance().
There’s no “check-then-create” logic (like in lazy singletons), so no race condition can happen.
So:
No need for synchronized.
No need for volatile.
It’s inherently thread-safe. ✅

🔹 Trade-offs
Pros:
Simple implementation.
Thread-safe by default.
Cons:
Instance is created even if it’s never used (can be wasteful if the object is heavy and rarely needed).*/