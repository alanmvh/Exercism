public class ExperimentalRemoteControlCar implements RemoteControlCar {
    int speed = 20;
    int distanceTravelled = 0;
    
    public void drive() {
        this.distanceTravelled += speed;
    }
    public int getDistanceTravelled() {
        return distanceTravelled;
    }
    
}