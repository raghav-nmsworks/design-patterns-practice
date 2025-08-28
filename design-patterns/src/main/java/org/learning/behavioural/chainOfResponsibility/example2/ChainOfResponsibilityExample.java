package org.learning.behavioural.chainOfResponsibility.example2;

abstract class Logger {
    protected Logger next;  // link to next handler

    public void setNext(Logger next) {
        this.next = next;
    }

    public void log(String level, String message) {
        if (canHandle(level)) {
            writeMessage(message);
        } else if (next != null) {
            next.log(level, message);  // pass along the chain
        }
    }

    protected abstract boolean canHandle(String level);
    protected abstract void writeMessage(String message);
}

class InfoLogger extends Logger {
    protected boolean canHandle(String level) { return "INFO".equalsIgnoreCase(level); }
    protected void writeMessage(String message) { System.out.println("INFO: " + message); }
}

class ErrorLogger extends Logger {
    protected boolean canHandle(String level) { return "ERROR".equalsIgnoreCase(level); }
    protected void writeMessage(String message) { System.out.println("ERROR: " + message); }
}

class DebugLogger extends Logger {
    protected boolean canHandle(String level) { return "DEBUG".equalsIgnoreCase(level); }
    protected void writeMessage(String message) { System.out.println("DEBUG: " + message); }
}

// Client
public class ChainOfResponsibilityExample {
    public static void main(String[] args) {
        Logger info = new InfoLogger();
        Logger debug = new DebugLogger();
        Logger error = new ErrorLogger();

        // build chain like a linked list
        info.setNext(debug);
        debug.setNext(error);

        info.log("INFO", "This is an info message.");
        info.log("DEBUG", "This is a debug message.");
        info.log("ERROR", "This is an error message.");
    }
}
