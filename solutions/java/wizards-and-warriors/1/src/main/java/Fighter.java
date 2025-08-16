abstract class Fighter {
    
    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter fighter) {
        int damagePoints = 0;
        damagePoints = (fighter.isVulnerable()) ? 10: 6;
        return damagePoints;
    }
}

class Wizard extends Fighter {
    boolean preparingSpell = false;

    @Override
    boolean isVulnerable() {
        return !this.preparingSpell;
    }

    @Override
    int damagePoints(Fighter fighter) {
        int damagePoints;
        damagePoints = (this.preparingSpell == true) ? 12 : 3;
        return damagePoints;
    }

    void prepareSpell() {
        System.out.println("Preparing my blastfire");
        this.preparingSpell = true;
    }

    public String toString(){
        return "Fighter is a Wizard";
    }

}
