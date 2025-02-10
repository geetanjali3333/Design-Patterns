package Strategy;

public class WalkStrategy implements PathCalcStrategy{
    @Override
    public void findPath() {
        System.out.println("Walk path");
    }
}
