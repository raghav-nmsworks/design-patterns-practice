package org.learning.creational.abstractFactory;

public abstract class DatabaseFactory {
    public abstract Database getDatabase(String type);

    public static DatabaseFactory createDatabaseFactory(String type){
        if(type.equals("RDBMS")){
            return new RDBMSDatabaseFactory();
        }
        else {
            return new DBMSDatabaseFactory();
        }
    }
}
