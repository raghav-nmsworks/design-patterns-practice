package org.learning.creational.Factory.factory;

import org.learning.creational.Factory.Database;
import org.learning.creational.Factory.RDBMS;

public class RDBMSFactory implements DatabaseFactory{
    @Override
    public Database createDatabase() {
        return new RDBMS();
    }
}
