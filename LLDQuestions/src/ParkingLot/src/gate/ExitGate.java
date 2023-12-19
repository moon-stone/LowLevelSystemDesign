package ParkingLot.src.gate;

import ParkingLot.src.utils.Ticket;
import ParkingLot.src.utils.Vehicle;
import ParkingLot.src.spotManager.ParkingSpotManager;

import java.sql.Time;

public class ExitGate {
    ParkingSpotManager parkingSpotManager;

    public ExitGate(ParkingSpotManager parkingSpotManager){
        this.parkingSpotManager = parkingSpotManager;
    }

    public void priceCalculation(Ticket ticket){
        System.out.println("Price is : "+ ticket.parkingTime);
    }

    public void Payment(){
        System.out.println("Payment Done via Cash");
    }

    public void removeVehicle(Vehicle vehicle){
        parkingSpotManager.removeVehicle(vehicle);
    }
}
