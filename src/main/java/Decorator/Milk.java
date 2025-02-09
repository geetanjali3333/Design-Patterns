package Decorator;

public class Milk implements AddOns{
    Beverage b;

    Milk(Beverage b){
        this.b=b;
    }
    @Override
    public void getDesc() {
        b.getDesc();
        System.out.println("Milk Cost: "+ getCost());
    }

    @Override
    public int getCost() {
        return b.getCost()+10;
    }
}
