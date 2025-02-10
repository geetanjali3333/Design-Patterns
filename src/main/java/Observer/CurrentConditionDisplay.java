package Observer;

public class CurrentConditionDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;
    public  CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float hum, float pressure) {
        this.temperature=temp;
        this.humidity=hum;
        display();
    }
    @Override
    public void display() {
        System.out.println("Current Conditions: "+ temperature+ " F degrees and humidity is "+ humidity);
    }
    public void registerToGetUpdates(){
        this.weatherData.registerObserver(this);
    }
    public void unregisterTheObserver(){
        this.weatherData.removeObserver(this);
    }
}
