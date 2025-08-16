public class LogLine {
    private String logLine;
    
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        switch(this.logLine.substring(1,4)){
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
                
        }
    }

    public String getOutputForShortLog() {
        switch(this.logLine.substring(1,4)){
            case "TRC":
                return LogLevel.TRACE.getNumberLevel() + ":" + this.logLine.substring(7) ;
            case "DBG":
                return LogLevel.DEBUG.getNumberLevel() + ":" + this.logLine.substring(7) ;
            case "INF":
                return LogLevel.INFO.getNumberLevel() + ":" + this.logLine.substring(7);
            case "WRN":
                return LogLevel.WARNING.getNumberLevel() + ":" + this.logLine.substring(7);
            case "ERR":
                return LogLevel.ERROR.getNumberLevel() + ":" + this.logLine.substring(7);
            case "FTL":
                return LogLevel.FATAL.getNumberLevel() + ":" + this.logLine.substring(7);
            default:
                return LogLevel.UNKNOWN.getNumberLevel() + ":" + this.logLine.substring(7);
        }
    }
}
