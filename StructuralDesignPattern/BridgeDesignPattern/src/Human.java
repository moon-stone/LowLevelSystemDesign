public class Human extends AbstractLivingThings{
    Human(IBreatheTechnique breatheObj){
        super(breatheObj);
    }
    @Override
    void breathStyle() {
        breatheTechnique.breathProcess();
    }
}
