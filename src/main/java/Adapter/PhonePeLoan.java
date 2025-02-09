package Adapter;

public class PhonePeLoan {
    public boolean  LoanCheck(BankAPI yb){
        if(yb.checkBalance() >100){
            System.out.println("Loan granted successfully");
            return true;
        }
        return false;
    }
}
