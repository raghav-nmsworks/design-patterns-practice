package org.learning.creational.Factory.factory;

import org.learning.creational.Factory.DBMS;
import org.learning.creational.Factory.Database;

public class DBMSFactory implements DatabaseFactory{
    @Override
    public Database createDatabase() {
        return new DBMS();
    }
}
