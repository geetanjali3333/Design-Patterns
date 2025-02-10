package Strategy;

public class PathCaclStrategyFactory {

    static PathCalcStrategy findMode(TravelMode travelMode){
        PathCalcStrategy p=null;
        if(travelMode.equals(TravelMode.BIKE)){
            p= (PathCalcStrategy) new BikeStrategy();
        }
        else if(travelMode.equals(TravelMode.CAR)){
            p= (PathCalcStrategy) new CarStrategy();
        }
        else if(travelMode.equals(TravelMode.WALK)){
            p= (PathCalcStrategy) new WalkStrategy();
        }
        return p;
    }
}
