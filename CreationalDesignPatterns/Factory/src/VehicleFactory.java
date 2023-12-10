public class VehicleFactory {
    String type;
    IVehicle vehicle;
    VehicleFactory(String type){
        this.type = type;
    }

    public IVehicle getVehicle(){
        switch (type){
            case "car" : vehicle = new Car();
                        break;
            case "bus" : vehicle = new Bus();
                        break;
            default: return null;
        }
        return vehicle;
    }
}
