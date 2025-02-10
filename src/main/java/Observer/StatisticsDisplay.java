package Observer;

public class StatisticsDisplay implements Observer,DisplayElement{

    private float maxTemp=0.0f;
    private float minTemp=200;
    private float tempSum=0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float hum, float pressure) {
            tempSum+=temp;
            numReadings++;
            if(temp>maxTemp){
                maxTemp=temp;
            }
            else if(temp<minTemp){
                minTemp=temp;
            }

            display();
    }

    @Override
    public void display() {
        System.out.println(" AVG/MAX/MIN  temperature= "+ (tempSum/numReadings) + " / "+ maxTemp+ "/ "+ minTemp);
    }


}
