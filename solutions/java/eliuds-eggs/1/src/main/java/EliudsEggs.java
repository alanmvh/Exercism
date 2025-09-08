public class EliudsEggs {
    public int eggCount(int number) {
        int eggCount = 0;
        while (number > 0) {
            if(number % 2 == 1) {
                eggCount ++;
            }
            number = number / 2;
        }
        return eggCount;
    }
}
