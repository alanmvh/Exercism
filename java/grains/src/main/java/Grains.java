import java.math.BigInteger;
import java.util.ArrayList;

class Grains {
    ArrayList<BigInteger> grainOnSquareList = new ArrayList<BigInteger>();

    BigInteger grainsOnSquare(final int square) {
        try {
            if (square <= 0 || square >= 65) {
                throw new IllegalArgumentException();
            }
            for (int i = 0; i < square; i++) {
                if (i == 0) {
                    grainOnSquareList.add(new BigInteger("1"));
                } else
                    // Gets value of last iteration, doubles it and then add that number to the arraylist
                    grainOnSquareList.add(grainOnSquareList.get(i - 1).multiply(new BigInteger("2")));
            }
            // Returns last element of the arrayList
            return grainOnSquareList.get(grainOnSquareList.size() - 1);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
    }

    BigInteger grainsOnBoard() {
        // Variable to store the sum of all grains
        BigInteger fillGrainsOnBoard = grainsOnSquare(64);
        BigInteger sumOfGrains = BigInteger.valueOf(0);
        for(int i = 0; i < 64; i++){
            sumOfGrains = sumOfGrains.add(grainOnSquareList.get(i));
        }
        return sumOfGrains;
    }

}
