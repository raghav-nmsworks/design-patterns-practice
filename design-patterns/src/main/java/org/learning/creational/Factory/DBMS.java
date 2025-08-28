package org.learning.creational.Factory;

public class DBMS implements Database{
    @Override
    public String connect(){
        return "Connection successful with DBMS";
    }
}
