package org.learning.behavioural.command;


interface ICommandAC{
    public void execute();
}

class AC{
    public void turnOn(){
        System.out.println("AC is turned on");
    }
    public void turnOff(){
        System.out.println("AC is turned off");
    }
    public void decreaseTemp(){
        System.out.println("AC temperature is decreased by 1");
    }

    public void increaseTemp(){
        System.out.println("AC temperature is increased by 1");
    }
}

class StartACCommand implements ICommandAC{

    AC ac;
    public StartACCommand(AC ac){
        this.ac = ac;
    }
    @Override
    public void execute() {
        System.out.println("Turning on the AC");
        ac.turnOn();
    }
}



class StopACCommand implements ICommandAC{
    AC ac;
    public StopACCommand(AC ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("Turning off the AC");
        ac.turnOff();
    }
}

class IncreaseTempCommand implements ICommandAC{
    AC ac;
    public IncreaseTempCommand(AC ac){
        this.ac = ac;
    }
    @Override
    public void execute() {
        System.out.println("Increasing AC Temperature by 1");
        ac.increaseTemp();
    }
}

class DecreaseTempCommand implements ICommandAC{
    AC ac;
    public DecreaseTempCommand(AC ac){
        this.ac = ac;
    }
    @Override
    public void execute() {
        System.out.println("Decreasing AC Temperature by 1");
        ac.decreaseTemp();
    }
}

class ACAutomationRemote{
    ICommandAC command;

    public void setCommand(ICommandAC command){
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }

}
public class CommandDesignPattern {
    public static void main(String[] args) {
        AC acRoom1 = new AC();
        AC acRoom2 = new AC();
        ACAutomationRemote remote = new ACAutomationRemote();
        remote.setCommand(new StartACCommand(acRoom1));
        remote.pressButton();
        remote.setCommand(new StartACCommand(acRoom2));
        remote.pressButton();
        remote.setCommand(new IncreaseTempCommand(acRoom2));
        remote.pressButton();
    }
}
