package ParkingLot.src.utils;

import ParkingLot.src.types.VehicleType;

public class Vehicle {
    String vehicleNumber;
    VehicleType vehicleType;

    public Vehicle(String vehicleNumber, VehicleType vehicleType){
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber(){
        return this.vehicleNumber;
    }

    public VehicleType getVehicleType(){
        return this.vehicleType;
    }
}
