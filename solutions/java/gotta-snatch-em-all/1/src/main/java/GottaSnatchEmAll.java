import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if(myCollection.isEmpty() | theirCollection.isEmpty()) {
            return false;
        }

        if(myCollection.size() != theirCollection.size()){
            return false;
        }

        Set<String> assymetricCollection = new HashSet<>(myCollection);
        assymetricCollection.removeAll(theirCollection);

        if(assymetricCollection.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    static Set<String> commonCards(List<Set<String>> collections) {

        // Copy first set collection
        Set<String> commonCardsCollection = new HashSet<>(collections.get(0));

        // Intersection with rest of collections
        for(int i = 1; i < collections.size(); i++) {
            commonCardsCollection.retainAll(collections.get(i));
        }        
        return commonCardsCollection;
    }

    static Set<String> allCards(List<Set<String>> collections) {

        // Copy first set as reference for Allcardcollection
        Set<String> allCardCollection = new HashSet<>(collections.get(0));

        // Adds all not present cards to allCardCollection
        for(int x = 1; x < collections.size(); x++) {
            allCardCollection.addAll(collections.get(x));
        }
        
        return allCardCollection;
    }
}
