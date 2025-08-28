package org.learning.creational.abstractFactory;

public class MongoDB implements Database{
    @Override
    public String connect() {
        return "Connection Successful with MongoDB.";
    }
}
