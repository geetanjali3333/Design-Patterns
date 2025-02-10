package Observer;

public class ForeCastDisplay implements Observer, DisplayElement{
    private float currentPressure=0.0f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForeCastDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float hum, float pressure) {
        lastPressure=currentPressure;
        currentPressure=pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Fore Cast");
        if(currentPressure>lastPressure){
            System.out.println("pressure is high");
        }
        else if(currentPressure==lastPressure){
            System.out.println("same pressure");
        }
        else if(currentPressure<lastPressure){
            System.out.println("Cool weather");
        }
    }

}
