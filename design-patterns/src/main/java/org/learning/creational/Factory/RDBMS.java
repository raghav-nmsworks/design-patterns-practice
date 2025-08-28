package org.learning.creational.Factory;


public class RDBMS implements Database {
    @Override
    public String connect() {
        return "Connection successful with RDBMS";
    }
}
