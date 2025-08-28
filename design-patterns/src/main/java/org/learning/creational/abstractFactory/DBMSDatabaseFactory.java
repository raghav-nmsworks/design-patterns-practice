package org.learning.creational.abstractFactory;

public class DBMSDatabaseFactory extends DatabaseFactory{
    @Override
    public Database getDatabase(String type) {
        Database database = null;
        if(type.equalsIgnoreCase("MONGODB")){
            database = new MongoDB();
        }
        else if (type.equalsIgnoreCase("MSACCESS")){
            database = new MsAccess();
        }
        return database;
    }
}
