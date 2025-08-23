import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

class RnaTranscription {

    Map<Character, Character> rnaTransctriptionMap = new HashMap<>();

    public RnaTranscription() {
        rnaTransctriptionMap.put('G', 'C');
        rnaTransctriptionMap.put('C', 'G');
        rnaTransctriptionMap.put('T', 'A');
        rnaTransctriptionMap.put('A', 'U');
    }


    String transcribe(String dnaStrand) {
        StringBuilder transcription = new StringBuilder();
        for(int i = 0; i < dnaStrand.length(); i++){
            transcription.append(rnaTransctriptionMap.get(dnaStrand.charAt(i)));
        }

        return transcription.toString();
    }

}
