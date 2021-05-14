import java.util.ArrayList;
import java.util.Arrays;

public class Ship {
    String name;
    ArrayList<Deck> decks = new ArrayList<>();


    public void setName(String name) {
        this.name = name;
    }

    public void setLocationDeck(int numberOfDecks,Enter enter) {
        for (int i = 0; i < numberOfDecks; i++) {
            Deck deck = new Deck();
            int  []tmp = enter.enterCoordinate();
            System.out.println(Arrays.toString(tmp));
            deck.setCoordinates(tmp);
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
