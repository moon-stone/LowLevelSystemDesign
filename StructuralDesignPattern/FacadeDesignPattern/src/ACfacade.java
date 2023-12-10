public class ACfacade {
    ACExternalUnit acExternalUnit;
    ACInternalUnit acInternalUnit;
    ACfacade() {
        acExternalUnit = new ACExternalUnit();
        acInternalUnit = new ACInternalUnit();
    }

    public void startAC() {
        acExternalUnit.checkElectricityConnection();
        acExternalUnit.checkVoltage();
        acInternalUnit.startACMotor();
        acInternalUnit.startACFan();
        acInternalUnit.startCooling();
    }
}
