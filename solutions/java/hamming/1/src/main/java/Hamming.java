import java.util.stream.IntStream;
class Hamming {
	private int distance;
    Hamming(String leftStrand, String rightStrand) {
        if(leftStrand.length() != rightStrand.length()) {
            if(leftStrand.length() == 0) {
                throw new IllegalArgumentException("left strand must not be empty.");
            }
            if(rightStrand.length() == 0) {
                throw new IllegalArgumentException("right strand must not be empty.");
            }
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.distance = (int) IntStream.range(0, leftStrand.length())
                .filter(i -> leftStrand.charAt(i) != rightStrand.charAt(i)).count();
    }
    int getHammingDistance() {
        return this.distance;
    }
}
