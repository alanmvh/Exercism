import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class HighScores {

    private final ArrayList<Integer> scores;
    private final ArrayList<Integer> sortedScores;

    public HighScores(List<Integer> highScores) {
        this.scores = new ArrayList<>(highScores);
        this.sortedScores = new ArrayList<>(scores);
        sortedScores.sort(Collections.reverseOrder());
    }

    List<Integer> scores() {
        return this.scores;
    }

    Integer latest() {
       return this.scores.getLast();
    }

    Integer personalBest() {
        int bestScore = 0;
        for (Integer score : this.scores) {
            if (score > bestScore) {
                bestScore = score;
            }
        }

        return bestScore;
    }

    List<Integer> personalTopThree() {
        if(!sortedScores.isEmpty() & sortedScores.size() < 4){
            return sortedScores;
        }
        else {
            return this.sortedScores.subList(0, 3);
        }

    }

}
