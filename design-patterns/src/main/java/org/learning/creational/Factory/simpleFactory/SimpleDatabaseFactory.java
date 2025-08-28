package org.learning.creational.Factory.simpleFactory;

import org.learning.creational.Factory.DBMS;
import org.learning.creational.Factory.Database;
import org.learning.creational.Factory.RDBMS;

public class SimpleDatabaseFactory {
    public static Database getDatabase(String dbType){
        Database database = null;
        if(dbType == null || dbType.isEmpty()){
            throw new IllegalArgumentException("Invalid database type");
        }else if ("RDBMS".equalsIgnoreCase(dbType)){
            database = new RDBMS();
        }else if ("DBMS".equalsIgnoreCase(dbType)){
            database = new DBMS();
        }
        return database;
    }
}
