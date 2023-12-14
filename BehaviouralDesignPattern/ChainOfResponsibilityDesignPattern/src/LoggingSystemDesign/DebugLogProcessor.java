package LoggingSystemDesign;

public class DebugLogProcessor extends LogProcessor {
    DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }
    public void Log(LogType logType, String msg){
        if(LogType.Debug == logType){
            System.out.println("Debug : "+msg);
        }
        else{
            super.Log(logType, msg);
        }
    }
}
