package LoggingSystemDesign;

public class Main {
    public static void main(String[] args){
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.Log(LogType.Error, "exception message");
        logProcessor.Log(LogType.Debug, "debug message");
        logProcessor.Log(LogType.Info, "Information message");
    }
}
