package ParkingLot.src.utils;

import ParkingLot.src.spotManager.ParkingSpot;

import java.sql.Time;

public class Ticket {
    public int ticketId;
    public Time parkingTime;
    public Vehicle vehicle;
    public ParkingSpot parkingSpot;

    public Ticket(int ticketId, Vehicle vehicle, ParkingSpot parkingSpot, Time parkingTime){
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.parkingTime = parkingTime;
    }
}
