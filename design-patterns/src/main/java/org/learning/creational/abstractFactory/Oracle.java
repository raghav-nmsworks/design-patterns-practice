package org.learning.creational.abstractFactory;

public class Oracle implements Database{
    @Override
    public String connect() {
        return "Connection Successful with Oracle DB.";
    }
}
