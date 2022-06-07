public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int carsPerHour = 221;
        if(speed >= 1 && speed <=4){
            return carsPerHour*speed;
        }
        else if(speed>=5 && speed<=8){
            return (carsPerHour*speed)*0.9;
        }
        else if(speed==9){
            return (carsPerHour*speed)*0.8;
        }
        else if(speed==10){
            return (carsPerHour*speed)*0.77;
        }
        return 0.0;
        
    } 

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed)/60;
    }
}
