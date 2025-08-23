class Acronym {

    private StringBuilder acronym = new StringBuilder();

    Acronym(String phrase) {
        String[] splitWord = phrase.split("[\\s\\-]+");
        for(String word : splitWord) {
            if(word.charAt(0) != '_'){
                acronym.append(word.charAt(0));
            } else {
                acronym.append(word.charAt(1));
            }
        }
    }

    String get() {
        return acronym.toString().toUpperCase();
    }

}
