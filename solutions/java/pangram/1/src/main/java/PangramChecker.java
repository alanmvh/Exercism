public class PangramChecker {

    private int[] charCounter = new int [26];

    public boolean isPangram(String input) {

        // Count caracter incidence by substracting 97  == 'a' to get index of array
        for(char c : input.toLowerCase().toCharArray()){
            if(c - 'a' >= 0 && c - 'a' <= 25) {
                charCounter[c - 'a'] += 1;
            }

        }

        for(int charIncidence : charCounter){
            if(charIncidence == 0) {
                return false;
            }
        }
        return true;
    }

}
