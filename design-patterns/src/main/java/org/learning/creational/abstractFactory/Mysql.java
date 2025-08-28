package org.learning.creational.abstractFactory;

import javax.xml.crypto.Data;

public class Mysql implements Database {
    @Override
    public String connect() {
        return "Connection Successful with Msql DB.";
    }
}
