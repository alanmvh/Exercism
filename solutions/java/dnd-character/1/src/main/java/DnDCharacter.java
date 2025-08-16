import java.util.List;
import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

class DnDCharacter {
    int hitPoints = 10;
    private int strength = ability(rollDice());
    private int dexterity = ability(rollDice());
    private int constitution = ability(rollDice());
    private int intelligence = ability(rollDice());
    private int wisdom = ability(rollDice());
    private int charisma = ability(rollDice());


    int ability(List<Integer> scores){

        int ability = 0;
        List<Integer> sortedList = sortList(scores);
        System.out.println(sortedList);
        for(int i=0;i<sortedList.size();i++){
            // Sums just the last 3 elements of the array
            if(i != 0){
                ability += sortedList.get(i);
            }
        }
        return ability;
    }

    // Creates new arrayList from input due to inmutable lists in test cases
    List<Integer> sortList(List<Integer> listToSort){

        // Extract values from listToSort and add to arrayListNumbers
        List<Integer> arrayListOfNumbers = new ArrayList<>(listToSort);
        int aux = 0;
        //Sort the list if i > i+1;
        for(int i=0; i<arrayListOfNumbers.size()-1;i++){
            if(arrayListOfNumbers.get(i) > arrayListOfNumbers.get(i+1)){
                aux = arrayListOfNumbers.get(i+1);
                arrayListOfNumbers.set(i+1, arrayListOfNumbers.get(i));
                arrayListOfNumbers.set(i, aux);
                // I = -1 because loops starts and add one unit to "i" so -1 + 1 = 0 and restart the counter
                i=-1;
            }

        }
        return arrayListOfNumbers;
    }

    List<Integer> rollDice() {
        Random r = new Random();
        List<Integer> diceNumbers = new ArrayList<>();
        //Generates and add each digit (1-6) to the array list
        for(int i=0; i<4; i++){
            diceNumbers.add(r.nextInt(5)+1);
        }
        return diceNumbers;
    }



    int modifier(int input) {
        return (int)Math.floor(((double)input - 10.0)/2.0);
    }

    int getStrength() {return this.strength;}

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return 10 + modifier(this.constitution);
    }
}