public class Bus implements IVehicle{
    @Override
    public void start() {
        System.out.println("Bus started");
    }

    @Override
    public void accelerate() {
        System.out.println("Bus accelerated");
    }

    @Override
    public void applyBreak() {
        System.out.println("Break applied");
    }
}
