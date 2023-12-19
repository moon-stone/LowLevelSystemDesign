package ParkingLot.src;

import ParkingLot.src.gate.EntranceGate;
import ParkingLot.src.gate.ExitGate;
import ParkingLot.src.spotManager.ParkingSpot;
import ParkingLot.src.spotManager.ParkingSpotManager;
import ParkingLot.src.types.VehicleType;
import ParkingLot.src.utils.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        ParkingSpotManager parkingSpotManager;
        EntranceGate parkingEntranceGate = new EntranceGate();
        ExitGate parkingExitGate;
        List<ParkingSpot> parkingSpotList = new ArrayList<>();
        ParkingSpot spot1 = new ParkingSpot(1, true, VehicleType.FourWheeler);
        ParkingSpot spot2 = new ParkingSpot(2, true, VehicleType.FourWheeler);
        ParkingSpot spot3 = new ParkingSpot(3, true, VehicleType.FourWheeler);
        ParkingSpot spot4 = new ParkingSpot(4, true, VehicleType.FourWheeler);
        ParkingSpot spot5 = new ParkingSpot(5, true, VehicleType.FourWheeler);

        parkingSpotList.add(spot1);
        parkingSpotList.add(spot2);
        parkingSpotList.add(spot3);
        parkingSpotList.add(spot4);
        parkingSpotList.add(spot5);

        Vehicle marutiCar = new Vehicle("UP541230", VehicleType.FourWheeler);
        Vehicle tataCar = new Vehicle("UP541232", VehicleType.FourWheeler);
        Vehicle kiaCar = new Vehicle("UP541223", VehicleType.FourWheeler);
        parkingEntranceGate.setParkingSpotManager(parkingSpotList, VehicleType.FourWheeler);
        parkingSpotManager = parkingEntranceGate.getParkingSpotManager();
        ParkingSpot parkingSpot = parkingEntranceGate.findParkingSpace(VehicleType.FourWheeler);
        System.out.println("ParkingSpot available for parking : " +parkingSpot.getParkingSpotId());
        parkingEntranceGate.bookParkingSpace(kiaCar);
        System.out.println("Vehicle parked at : " +parkingEntranceGate.bookParkingSpace(kiaCar));

        //vehicle leaving through exit gate
        parkingExitGate = new ExitGate(parkingSpotManager);

        parkingExitGate.removeVehicle(kiaCar);
    }
}
