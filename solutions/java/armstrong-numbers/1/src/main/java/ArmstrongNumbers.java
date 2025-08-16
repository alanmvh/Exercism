class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int sum = 0;
        // Parse Int > String in order to get each digit
        String numString = Integer.toString(numberToCheck);
        for(int i=0; i<numString.length();i++){
            // Sum + digit ^ power of digit count
            sum += Math.pow((double) Character.getNumericValue(numString.charAt(i)),(double)numString.length());
        }

        return numberToCheck == sum;

    }

}
