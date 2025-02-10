package Strategy;

public class GoogleMaps {
    void findPathByMode(TravelMode travelMode){
        PathCalcStrategy p=PathCaclStrategyFactory.findMode( travelMode);
        p.findPath();
    }
}
