abstract class AbstractLivingThings {
    IBreatheTechnique breatheTechnique;
    AbstractLivingThings(IBreatheTechnique breatheTechnique){
        this.breatheTechnique = breatheTechnique;
    }
    abstract void breathStyle();
}
