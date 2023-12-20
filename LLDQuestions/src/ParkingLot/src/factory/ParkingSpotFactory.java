package ParkingLot.src.factory;

import ParkingLot.src.types.VehicleType;
import ParkingLot.src.spotManager.*;

import java.util.List;

public class ParkingSpotFactory {
    ParkingSpotManager parkingSpotManager;
    public ParkingSpotManager getParkingManager(List<ParkingSpot> parkingSpotList, VehicleType wheelerType){
        switch (wheelerType){
            case VehicleType.FourWheeler -> {
                parkingSpotManager = new FourWheelerManager(parkingSpotList);
            }
            case VehicleType.TwoWheeler -> {
                parkingSpotManager = new TwoWheelerManager(parkingSpotList);
            }
        }
        return parkingSpotManager;
    }
}
