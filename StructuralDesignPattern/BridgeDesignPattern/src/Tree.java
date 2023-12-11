public class Tree extends AbstractLivingThings{
    Tree(IBreatheTechnique breatheObj){
        super(breatheObj);
    }
    @Override
    void breathStyle() {
        breatheTechnique.breathProcess();
    }
}
