package Adapter;

public class ICICIBankAPIAdapter implements BankAPI{
    @Override
    public int checkBalance() {
        return 0;
    }

    @Override
    public void transferMoney(int amount) {
        System.out.println("TransferMoney ICICIBank");
    }
}
