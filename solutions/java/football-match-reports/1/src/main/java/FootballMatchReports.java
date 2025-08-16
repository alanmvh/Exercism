public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        String outputDescription = "";
        switch(shirtNum){
            case 1:
                outputDescription = "goalie";
                break;
            case 2:
                outputDescription = "left back";
                break;
            case 3: 
                outputDescription = "center back";
                break;
            case 4: 
                outputDescription = "center back";   
                break;
            case 5:
                outputDescription = "right back";
                break;
            case 6:
                outputDescription = "midfielder";
                break;
            case 7: 
                outputDescription = "midfielder";
                break;
            case 8: 
                outputDescription = "midfielder";
                break;
            case 9:
                outputDescription = "left wing";
                break;
            case 10:
                outputDescription = "striker";
                break;
            case 11:
                outputDescription = "right wing";
                break;
            default:
                throw new IllegalArgumentException();
                
            
        }
        return outputDescription;
    }
}
