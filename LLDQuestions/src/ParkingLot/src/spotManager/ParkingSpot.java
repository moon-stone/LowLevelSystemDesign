package ParkingLot.src.spotManager;

import ParkingLot.src.utils.Vehicle;
import ParkingLot.src.types.VehicleType;

public class ParkingSpot {
    private int parkingSpotId;
    private boolean isEmpty;
    private Vehicle vehicle;
    private VehicleType parkingSpotType;

    public ParkingSpot(){
        isEmpty = true;
        this.vehicle = null;
    }

     public ParkingSpot(int parkingSpotId, boolean isEmpty, VehicleType parkingSpotType){
        this.isEmpty = isEmpty;
        this.parkingSpotId = parkingSpotId;
        this.parkingSpotType = parkingSpotType;
    }

    public VehicleType getParkingSpotType(){
        return parkingSpotType;
    }

    public int getParkingSpotId(){
        return parkingSpotId;
    }

    public int parkVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        isEmpty = false;
        return this.parkingSpotId;
    }

    public void removeVehicle(){
        isEmpty = true;
        vehicle = null;
    }

    public boolean isEmpty(){
        return isEmpty;
    }

}
