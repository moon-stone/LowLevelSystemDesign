package ParkingLot.src.gate;

import ParkingLot.src.utils.Ticket;
import ParkingLot.src.utils.Vehicle;
import ParkingLot.src.types.VehicleType;
import ParkingLot.src.factory.ParkingSpotFactory;
import ParkingLot.src.spotManager.ParkingSpot;
import ParkingLot.src.spotManager.ParkingSpotManager;

import java.sql.Time;
import java.util.List;

public class EntranceGate {
    static int ticketId;
    Ticket ticket;
    ParkingSpotFactory parkingSpotFactory;
    ParkingSpotManager parkingSpotManager;

    public EntranceGate(){
        ticketId = 0;
        parkingSpotFactory = new ParkingSpotFactory();
    }

    public void setParkingSpotManager(List<ParkingSpot> parkingSpotList, VehicleType vehicleType){
        parkingSpotManager = parkingSpotFactory.getParkingManager(parkingSpotList, vehicleType);
    }

    public ParkingSpotManager getParkingSpotManager(){
        return parkingSpotManager;
    }
    public ParkingSpot findParkingSpace(VehicleType vehicleType){
        return parkingSpotManager.findParkingSpot(vehicleType);
    }

    public int bookParkingSpace(Vehicle vehicle){
        return parkingSpotManager.parkVehicle(vehicle);
    }

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot){
        ticket = new Ticket(ticketId++, vehicle, parkingSpot, new Time(10000));
        System.out.println("TicketDetails : ");
        System.out.println("TicketId : " +ticket.ticketId+ " , VehicleNo : "+ticket.vehicle.getVehicleNumber()+" ,parkingSpotId : "+ticket.parkingSpot.getParkingSpotId()+" , bookedAt : "+ticket.parkingTime);
        return ticket;
    }
}
