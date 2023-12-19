package ParkingLot.src.factory;

import ParkingLot.src.types.VehicleType;
import ParkingLot.src.spotManager.*;

import java.util.List;

public class ParkingSpotFactory {

    public ParkingSpotManager getParkingManager(List<ParkingSpot> parkingSpotList, VehicleType wheelerType){
        switch (wheelerType){
            case VehicleType.FourWheeler -> new FourWheelerManager(parkingSpotList);
            case VehicleType.TwoWheeler -> new TwoWheelerManager(parkingSpotList);
        }
        return null;
    }
}
