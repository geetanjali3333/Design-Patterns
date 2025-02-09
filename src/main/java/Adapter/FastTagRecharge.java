package Adapter;

public class FastTagRecharge {
    int recharge(BankAPI yb, int amount){
        if(yb.checkBalance() >=amount){
            System.out.println("Recharge Successfully");
            return 1;
        }
        System.out.println("Insufficient Funds");
        return -1;
    }
}
