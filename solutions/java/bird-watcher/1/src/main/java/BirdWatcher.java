class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeek = {0, 2, 5, 3, 7, 8, 4};
        return lastWeek;
    }

    public int getToday() {
        if(birdsPerDay.length==0){
            return 0;
        }else
            return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[(birdsPerDay.length-1)] = birdsPerDay[birdsPerDay.length-1]+1;
    }

    public boolean hasDayWithoutBirds() {
        for(int birds:birdsPerDay){
            if(birds==0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        if(numberOfDays>6){
            // 7 Is the mas number of weekdays
            numberOfDays = 7;
        }
        for(int i=0; i<numberOfDays;i++){
            sum = sum + birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int bird:birdsPerDay){
            if(bird>=5){
                busyDays++;
            }
        }
        return busyDays;
    }
}
