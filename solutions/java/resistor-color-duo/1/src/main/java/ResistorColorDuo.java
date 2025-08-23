import java.util.ArrayList;
import java.util.List;

class ResistorColorDuo {
    private final List<String> transistorColor = new ArrayList<>();

    public ResistorColorDuo() {
        transistorColor.add("black");
        transistorColor.add("brown");
        transistorColor.add("red");
        transistorColor.add("orange");
        transistorColor.add("yellow");
        transistorColor.add("green");
        transistorColor.add("blue");
        transistorColor.add("violet");
        transistorColor.add("grey");
        transistorColor.add("white");
    }

    int value(String[] colors) {
        StringBuilder numConcatenation = new StringBuilder();

        for(int i = 0; i < 2; i++) {
            if(transistorColor.indexOf(colors[i]) != 0 & i == 0){
                 numConcatenation.append(transistorColor.indexOf(colors[i]));
            } else {
                numConcatenation.append(transistorColor.indexOf(colors[i]));
            }
        }

        return Integer.parseInt(numConcatenation.toString());

    }
}
