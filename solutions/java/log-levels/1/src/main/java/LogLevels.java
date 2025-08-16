
public class LogLevels {

    static String[] logLevelsArray = {"ERROR", "INFO", "WARNING"};

    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf(":")+1).trim();
    }

    public static String logLevel(String logLine) {
        String msg = "";
        for(int i=0; i<logLevelsArray.length;i++){
            if(logLine.contains(logLevelsArray[i])){
                msg = logLevelsArray[i].toLowerCase();
                break;
            }
        }
        return msg;
    }

    public static String reformat(String logLine) {
        String msg = "";
        for(int i=0; i<logLevelsArray.length;i++){
            if(logLine.contains(logLevelsArray[i])){
                msg = logLevelsArray[i].toLowerCase();
            }
        }
        return logLine.substring(logLine.indexOf(":")+1).trim() + " (" + msg + ")";
    }
}
