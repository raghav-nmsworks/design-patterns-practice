package org.learning.behavioural.chainOfResponsibility;


class Loan{
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "amount=" + amount +
                '}';
    }
}

abstract class LoanApproval{
    protected LoanApproval nextLoanApproval;

    public void setNextLoanApproval(LoanApproval nextLoanApproval){
        this.nextLoanApproval = nextLoanApproval;
    }

    public abstract void approveLoan(Loan loan);
}


class Manager extends LoanApproval {

    @Override
    public void approveLoan(Loan loan) {
        if (loan.getAmount() <= 100000){
            System.out.println("Loan approved by Manager");
        }else {
            nextLoanApproval.approveLoan(loan);
        }
    }
}

class Director extends LoanApproval {

    @Override
    public void approveLoan(Loan loan) {
        if (loan.getAmount() <= 250000){
            System.out.println("Loan approved by Director");
        }else {
            nextLoanApproval.approveLoan(loan);
        }
    }
}

class VicePresident extends LoanApproval {
    @Override
    public void approveLoan(Loan loan) {
        System.out.println("Loan approved by Vice President");
    }
}
public class ChainOfResponsibility {
    public static void main(String[] args) {
        LoanApproval manager = new Manager();
        LoanApproval director = new Director();
        LoanApproval vicePresident = new VicePresident();
        manager.setNextLoanApproval(director);
        director.setNextLoanApproval(vicePresident);
        Loan loan = new Loan();
        loan.setAmount(260000);
        manager.approveLoan(loan);

    }
}
