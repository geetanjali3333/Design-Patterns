package Decorator;

public class Mocha implements AddOns{
    Beverage be;
    Mocha(Beverage be){
        this.be=be;
    }
    @Override
    public void getDesc() {
        be.getDesc();
        System.out.println("Mocha cost: "+ getCost());
    }

    @Override
    public int getCost() {
        return be.getCost()+ 5;
    }
}
