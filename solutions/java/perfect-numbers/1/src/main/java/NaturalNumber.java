class NaturalNumber {

    private int number;
    private int aliquotSum;
    private Classification classification;

    NaturalNumber(int number) {
        if(number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.number = number;
    }

    Classification getClassification() {
        aliquotSum = getAliquotNumber(number);
        
        if (aliquotSum == number ) {
            return Classification.PERFECT;
        }
        else if (aliquotSum > number) {
            return Classification.ABUNDANT;
        }
        else {
            return classification.DEFICIENT;
        }
        
    }

    private int getAliquotNumber(int number) {
        int aliquotSum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
                aliquotSum += i;
            }
        }
        return aliquotSum;
    }
}
