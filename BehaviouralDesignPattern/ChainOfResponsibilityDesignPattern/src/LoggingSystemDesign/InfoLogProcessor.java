package LoggingSystemDesign;

public class InfoLogProcessor extends LogProcessor{
    InfoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void Log(LogType logType, String msg){
        if(LogType.Info == logType){
            System.out.println("Info : "+msg);
        }
        else{
            super.Log(logType, msg);
        }
    }
}
