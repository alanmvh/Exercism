public class ElonsToyCar {
    private int distanceDriven = 0;
    private int battery = 100;
    
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
        
    }

    public String distanceDisplay() {
        return "Driven " + Integer.toString(this.distanceDriven) + " meters";
    }

    public String batteryDisplay() {
        if(this.battery <= 0){
            return "Battery empty";
        }
        else
            return "Battery at " + Integer.toString(this.battery) + "%";
    }

    public void drive() {
        // Verify if battery is empty if not continue...
        String batteryState = batteryDisplay();
        if(batteryState != "Battery empty"){
            this.distanceDriven = this.distanceDriven + 20;
            this.battery--;
        }
            
    }
}
