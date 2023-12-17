public class FactoryDriveStrategy {
    public IDriveStrategy driveStrategy(DriveType driveType){
        return switch (driveType) {
            case driveType.SPECIAL -> new SpecialDrive();
            case driveType.NORMAL -> new NormalDrive();
            default -> null;
        };
    }
}
