
import java.util.ArrayList;
import java.util.List;

class ResistorColor {

    List<String> transistorColor = new ArrayList<>();

    public ResistorColor() {
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

    int colorCode(String color) {
        return transistorColor.indexOf(color);
    }

    String[] colors() {

        return transistorColor.toArray(new String[0]);
    }
}
