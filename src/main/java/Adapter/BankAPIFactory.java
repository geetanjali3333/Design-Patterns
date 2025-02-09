package Adapter;

public class BankAPIFactory {
    public static BankAPI getBankAPIByName(String bankAPIName){
        if(bankAPIName.equals("YesBank")){
            return new YesBankAPIAdapter();
        }
        else if(bankAPIName.equals("ICICI Bank")){
            return new ICICIBankAPIAdapter();
        }
        return null;
    }
}
