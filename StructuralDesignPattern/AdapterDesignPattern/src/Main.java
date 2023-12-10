
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IWeightAdapter weightAdapter = new WeightAdapter(new WeightMachine(100));
        System.out.println("weight in kg : " + weightAdapter.weightInKg());
    }
}