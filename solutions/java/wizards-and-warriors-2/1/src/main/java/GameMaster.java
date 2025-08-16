public class GameMaster {
    private String result;
    // TODO: define a 'describe' method that returns a description of a Character
    public String describe(Character character){
        return String.format("You're a level %s %s with %s hit points.", character.getLevel(),
                             character.getCharacterClass(),
                             character.getHitPoints());
    }
    // TODO: define a 'describe' method that returns a description of a Destination
    public String describe(Destination destination){
        return String.format("You've arrived at %s, which has %s inhabitants.", destination.getName(), destination.getInhabitants());
    }
    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public String describe(TravelMethod travelMethod){

        switch(travelMethod){
            case HORSEBACK:
                this.result = String.format("You're traveling to your destination on horseback.");
                break;
            case WALKING:
                this.result = String.format("You're traveling to your destination by walking.");
                break;
        }
        return this.result;
    }
    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public String describe(Character character, Destination destination, TravelMethod travelMethod){
        return String.format("You're a level %s %s with %s hit points. %s %s", character.getLevel(), 
                             character.getCharacterClass(), 
                             character.getHitPoints(),
                            describe(travelMethod),
                            describe(destination));
    }
    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public String describe(Character character, Destination destination){
        return String.format("You're a level %s %s with %s hit points. %s %s", character.getLevel(), 
                             character.getCharacterClass(), 
                             character.getHitPoints(), 
                             describe(TravelMethod.WALKING),
                             describe(destination));
    }
}
