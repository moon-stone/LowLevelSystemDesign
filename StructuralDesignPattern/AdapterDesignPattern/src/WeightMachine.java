public class WeightMachine implements IWeightMachine{
    private int weight;
    WeightMachine(int weight){
        this.weight = weight;
    }
    @Override
    public int weightInPound() {
        return weight;
    }
}
