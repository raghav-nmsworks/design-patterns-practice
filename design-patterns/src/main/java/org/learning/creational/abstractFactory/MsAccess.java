package org.learning.creational.abstractFactory;

public class MsAccess implements Database{
    @Override
    public String connect() {
        return "Connection Successful with MsAccess DB.";
    }
}
