package org.learning.creational.Factory.simpleFactory;

import org.learning.creational.Factory.Database;

public class SimpleFactoryDesignPattern {
    public static void main(String[] args) {
        Database db = SimpleDatabaseFactory.getDatabase("RDBMS");
        System.out.println("Database : " + db.getClass().getName());
        System.out.println(db.connect());

        Database db1 = SimpleDatabaseFactory.getDatabase("DBMS");
        System.out.println("Database : " + db1.getClass().getName());
        System.out.println(db1.connect());
    }
}
