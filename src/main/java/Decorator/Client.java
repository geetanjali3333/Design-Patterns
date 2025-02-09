package Decorator;

public class Client {
    public static void main(String[] args){
        //Double Mocha HouseBlend with milk
        Beverage b=new HouseBlend();
        b=new Mocha(b);
        b=new Mocha(b);
        b=new Milk(b);
        b.getDesc();


    }
}
