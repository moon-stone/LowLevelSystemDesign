We are implementing parking lot with one entrance, one exit and one floor which can
be scalable.

RoughFlow : At EntranceGate, Vehicle gets Ticket and then go to that ParkingSpot. After
sometime Vehicle leaves through the ExitGate.


Objects Identification:
=======================
Vehicle : vehicleNo, vehicleType(2wheeler or 4wheeler)
Ticket : ticketId, entryTime, parkingSpot, vehicleNo, price
EntranceGate : ticketGeneration(), findParkingSpot(), updateParkingSpot()
ParkingSpot : parkingId, vehicle, isEmpty, type(2wheeler or 4wheeler), price, parkVehicle(), removeVehicle()
ExitGate : costCalculation(), payment(), updateParkingSpot()