package Adapter;

public class PhonePe {
    BankAPI yb;
    PhonePeLoan loan=new PhonePeLoan();
    FastTagRecharge ft=new FastTagRecharge();

    void setBankAPI(BankAPI bankAPI){
        yb=bankAPI;
    }

    boolean checkLoneEligibility(){
        return loan.LoanCheck(yb);
    }
    boolean rechargeFastTag(){
        if(ft.recharge(yb,1000)>0){
            return true;
        }
        else{
            throw new RuntimeException("Add more Funds");
        }
    }
}
