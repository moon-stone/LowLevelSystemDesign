public class Fish extends AbstractLivingThings{
    Fish(IBreatheTechnique breatheObj){
        super(breatheObj);
    }
    @Override
    void breathStyle() {
        breatheTechnique.breathProcess();
    }
}
