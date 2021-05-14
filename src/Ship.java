import java.util.ArrayList;
import java.util.Arrays;

public class Ship {
    String name;
    ArrayList<Deck> decks = new ArrayList<>();


    public void setName(String name) {
        this.name = name;
    }

    public void setLocationShip(int numberOfDecks) {
        for (int i = 0; i < numberOfDecks; i++) {
            Deck deck = new Deck();
            deck.setCoordinates();
            decks.add(deck);
        }
    }

    public ArrayList<Deck> getLocationDeck() {
        ArrayList<Deck> result = new ArrayList<>();

        for (Deck deck : decks
        ) {
            result.add(deck);
        }
        return result;
    }

}
