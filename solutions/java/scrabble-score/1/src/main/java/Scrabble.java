import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

class Scrabble {
    private char[] wordArray;
    private final Map<Integer, List<Character>> wordValue = Map.of(
            1, List.of('A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'),
            2, List.of('D', 'G'),
            3, List.of('B', 'C', 'M', 'P'),
            4, List.of('F', 'H', 'V', 'W', 'Y'),
            5, List.of('K'),
            8, List.of('J', 'X'),
            10, List.of('Q', 'Z')
    );

    Scrabble(String word) {
        this.wordArray = word.toUpperCase().toCharArray();
    }

    int getScore() {
        int sumValueOfWords = 0;
        for(int i = 0; i < wordArray.length; i++) {
            sumValueOfWords += getValueOfWord(wordArray[i]);
        }

        return sumValueOfWords;
    }

    private int getValueOfWord(Character characterToFind) {
        int result = 0;
        for(var entry : wordValue.entrySet()) {
            if(entry.getValue().contains(characterToFind)){
                result = entry.getKey();
            }
        }
        return result;
    }

}
