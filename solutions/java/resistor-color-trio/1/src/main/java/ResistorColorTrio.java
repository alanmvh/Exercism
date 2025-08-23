import java.util.ArrayList;
import java.util.List;

class ResistorColorTrio {
    private final List<String> resistorColors = new ArrayList<>();

    public ResistorColorTrio() {
        resistorColors.add("black");   // 0
        resistorColors.add("brown");   // 1
        resistorColors.add("red");     // 2
        resistorColors.add("orange");  // 3
        resistorColors.add("yellow");  // 4
        resistorColors.add("green");   // 5
        resistorColors.add("blue");    // 6
        resistorColors.add("violet");  // 7
        resistorColors.add("grey");    // 8
        resistorColors.add("white");   // 9
    }

    String label(String[] colors) {

        StringBuilder valueOhm = new StringBuilder();
        for(int i = 0; i < 3; i++) {
            if(i == 0  && resistorColors.indexOf(colors[i]) != 0) {
                valueOhm.append(resistorColors.indexOf(colors[i]));
            }
            if(i == 1) {
                valueOhm.append(resistorColors.indexOf(colors[i]));
            }
            if(i == 2) {
                for(int x = 0; x < resistorColors.indexOf(colors[i]); x++){
                    valueOhm.append(0);
                }
            }

        }

        double valueOhmD = Double.parseDouble(valueOhm.toString());

        if(valueOhmD > 1000 && valueOhmD <= 1_000_000){
            return (int)(valueOhmD / 1000) + " kiloohms";
        }
        if(valueOhmD > 1_000_000 && valueOhmD <= 1_000_000_000	){
            return (int)(valueOhmD / 1_000_000) + " megaohms";
        }
        if(valueOhmD > 1_000_000_000){
            return (int)(valueOhmD / 1_000_000_000) + " gigaohms";
        }

        return (int) valueOhmD + " ohms";
    }
}
