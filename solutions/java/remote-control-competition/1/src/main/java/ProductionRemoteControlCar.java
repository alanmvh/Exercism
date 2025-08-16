class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    int speed = 10;
    int distanceTravelled = 0;
    int victories;
    
    public void drive() {
        this.distanceTravelled += speed;
    }
    public int getDistanceTravelled() {
        return distanceTravelled;
    }
    public int getNumberOfVictories() {
        return victories;
    }
    public void setNumberOfVictories(int numberOfVictories) {
        this.victories = numberOfVictories;
    }
    @Override
    public int compareTo(ProductionRemoteControlCar arg0) {
        return arg0.getNumberOfVictories() - this.getNumberOfVictories();
    }
}