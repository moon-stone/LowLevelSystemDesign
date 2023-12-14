package LoggingSystemDesign;

public abstract class LogProcessor {
    LogProcessor nextLogProcessor;
    LogProcessor(LogProcessor logProcessor){
        this.nextLogProcessor = logProcessor;
    }

    public void Log(LogType logType, String msg){
        if(nextLogProcessor != null){
            nextLogProcessor.Log(logType, msg);
        }
    }
}
