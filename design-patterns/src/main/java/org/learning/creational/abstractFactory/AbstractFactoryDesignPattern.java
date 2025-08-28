package org.learning.creational.abstractFactory;

public class AbstractFactoryDesignPattern {
    public static void main(String[] args) {
        DatabaseFactory factory = null;
        Database database = null;

        factory = DatabaseFactory.createDatabaseFactory("RDBMS");
        database = factory.getDatabase("ORACLE");
        System.out.println(database.connect());

        factory = DatabaseFactory.createDatabaseFactory("DBMS");
        database = factory.getDatabase("MONGODB");
        System.out.println(database.connect());
    }
}
