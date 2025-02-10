package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData(){
        observerList=new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observerList.add(o);
        System.out.println("Observer registered successfully");
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
        System.out.println("Observer removed successfully");
    }

    @Override
    public void notifyObserver() {
        for(Observer ob:observerList){
            ob.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }
    public float getTemperature(){
        return temperature;
    }
    public float getHumidity(){
        return humidity;
    }
    public float getPressure(){
        return pressure;
    }
}
