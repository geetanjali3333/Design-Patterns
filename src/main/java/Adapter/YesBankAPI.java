package Adapter;

public class YesBankAPI {
    int transferAmount=0;
    public int getBalance(){
        return 150;
    }
    public void moneyTransfer(){
        System.out.println("Money is transferred via Yes Bank!");
    }
    public void setTransferAmount(int amount){
        transferAmount=amount;
    }
}
