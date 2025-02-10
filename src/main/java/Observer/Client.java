package Observer;

public class Client {
    public static void main(String[] args) {
        WeatherData w=new WeatherData();
        //adding subscribers
        CurrentConditionDisplay cu=new CurrentConditionDisplay(w);
        ForeCastDisplay fc=new ForeCastDisplay(w);
        StatisticsDisplay st=new StatisticsDisplay(w);

        w.setMeasurements(80,65,30.4f);
        w.setMeasurements(82,70,29.2f);
        cu.unregisterTheObserver();
        w.setMeasurements(62,90,28.1f);
        cu.registerToGetUpdates();
        w.setMeasurements(99,90,28.1f);
    }
}
