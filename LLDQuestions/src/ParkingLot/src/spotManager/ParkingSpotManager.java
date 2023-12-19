package ParkingLot.src.spotManager;

import ParkingLot.src.utils.Constants;
import ParkingLot.src.utils.Vehicle;
import ParkingLot.src.types.VehicleType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingSpotManager {
    private List<ParkingSpot> parkingSpotList;
    private Map<Vehicle, ParkingSpot> vehicleParkedSpot = new HashMap<>();

    ParkingSpotManager(List<ParkingSpot> parkingSpotList){
        this.parkingSpotList = parkingSpotList;
    }

    public void addParkingSpot(ParkingSpot parkingSpot){
        parkingSpotList.add(parkingSpot);
    }

    public void removeParkingSpot(ParkingSpot parkingSpot){
        parkingSpotList.remove(parkingSpot);
    }

    public ParkingSpot findParkingSpot(VehicleType vehicleType){
        for(ParkingSpot parkingSpot : parkingSpotList){
            if(parkingSpot.isEmpty() && parkingSpot.getParkingSpotType().equals(vehicleType)){
                return parkingSpot;
            }
        }
        return null;
    }

    public int parkVehicle(Vehicle vehicle){
        int parkingSpotId;
        ParkingSpot parkingSpot = findParkingSpot(vehicle.getVehicleType());
        if(parkingSpot != null){
            vehicleParkedSpot.put(vehicle, parkingSpot);
            parkingSpotId = parkingSpot.parkVehicle(vehicle);
            System.out.println("VehicleParked at : "+parkingSpotId);
            return parkingSpotId;
        }
        return Constants.NOT_AVAILABLE;
    }

    public void removeVehicle(Vehicle vehicle){
        ParkingSpot parkingSpot = vehicleParkedSpot.get(vehicle);
        parkingSpot.removeVehicle();
        System.out.println("Vehicle removed from : "+parkingSpot.getParkingSpotId());
    }
}
