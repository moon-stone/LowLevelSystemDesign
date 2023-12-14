package LoggingSystemDesign;

public class ErrorLogProcessor extends LogProcessor{
    ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void Log(LogType logType, String msg){
        if(LogType.Error == logType){
            System.out.println("Error : "+msg);
        }
        else{
            super.Log(logType, msg);
        }
    }
}
