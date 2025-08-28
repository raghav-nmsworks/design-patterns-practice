package org.learning.creational.abstractFactory;

public class RDBMSDatabaseFactory extends DatabaseFactory{
    @Override
    public Database getDatabase(String type) {
        Database database = null;
        if(type.equalsIgnoreCase("ORACLE")){
            database = new Oracle();
        }
        else if (type.equalsIgnoreCase("MYSQL")){
            database = new Mysql();
        }
//        else if (type.equalsIgnoreCase("MSACCESS")){
//            database = new MsAccess();
//        }
        return database;
    }
}
