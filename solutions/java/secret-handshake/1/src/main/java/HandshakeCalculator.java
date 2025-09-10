import java.util.*;

class HandshakeCalculator {
    private final Map<Integer, Signal> secretAction = Map.of(
            1, Signal.WINK,
            2, Signal.DOUBLE_BLINK,
            3, Signal.CLOSE_YOUR_EYES,
            4, Signal.JUMP
    );

    List<Signal> calculateHandshake(int number) {
        String binaryForm = getBinaryForm(number);
        return generateSecretActions(binaryForm);
    }

    private String getBinaryForm(int number) {
        StringBuilder binaryForm = new StringBuilder();
        while (number > 0) {
            if (number % 2 == 1) {
                binaryForm.append(1);
            } else {
                binaryForm.append(0);
            }
            number = number / 2;
        }
        return binaryForm.reverse().toString();
    }

    private List<Signal> generateSecretActions(String binaryForm) {
        List<Signal> secretActionsList = new ArrayList<>();
        int indexForWordMap = 1;
        for (int i = binaryForm.length() -  1; i  >= 0; i--) {
            if ((binaryForm.charAt(i) == '1' ) && (indexForWordMap < 5)) {
                secretActionsList.add(secretAction.get(indexForWordMap));
            }

            if (indexForWordMap == 5 && binaryForm.charAt(i) == '1' ) {
                Collections.reverse(secretActionsList);
            }

            indexForWordMap++;
        }

        return secretActionsList;
    }

}
