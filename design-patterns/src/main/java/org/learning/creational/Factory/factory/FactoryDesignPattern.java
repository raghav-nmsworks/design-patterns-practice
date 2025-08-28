package org.learning.creational.Factory.factory;

import org.learning.creational.Factory.Database;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        DatabaseFactory factory = new RDBMSFactory();
        Database db = factory.createDatabase();
        System.out.println(db.connect());

        DatabaseFactory factory1 = new DBMSFactory();
        Database db1 = factory1.createDatabase();
        System.out.println(db1.connect());
    }
}
