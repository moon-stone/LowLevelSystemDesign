public class WeightAdapter implements IWeightAdapter{
    IWeightMachine weightMachine;
    WeightAdapter(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }
    @Override
    public int weightInKg() {
        return (int) (weightMachine.weightInPound() * .45);
    }
}
