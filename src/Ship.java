import java.util.ArrayList;
import java.util.Random;

public class Ship {
    String name;
    ArrayList<Deck> decks = new ArrayList<>();


    public void setName(String name) {
        this.name = name;
    }

    public void setLocationDeck(int numberOfDecks, Enter enter) {
      //  do {
            for (int i = 0; i < numberOfDecks; i++) {
                Deck deck = new Deck();
                deck.setCoordinates(enter);
//               // deck.coordinates= deck.getCoordinates();
//if (numberOfDecks>1){
//    Deck lastDeck = decks.get(0);
//    Random random =new Random();
//    int n = random.nextInt(2);
//    if (n==0){// horizontal
//        for (int j = 0; j < numberOfDecks; j++) {
//            Deck deck1 = new Deck();
//            deck1.coordinates = new int[]{lastDeck.coordinates[0],};
//        }
//    }else {  //vertical
//
//    }
//}
                decks.add(deck);
            }
       // } while (checkingLineOfShip(numberOfDecks));

    }

//    private boolean checkingLineOfShip(int numberOfDecks) {
//        int xLine = 0;
//        int yLine = 0;
//        for (int i = 0; i < numberOfDecks; i++) {
//            xLine += decks.get(i).coordinates[0];
//            yLine += decks.get(i).coordinates[1];
//        }
//        return (xLine / numberOfDecks == decks.get(0).coordinates[0]) || (yLine / numberOfDecks == decks.get(0).coordinates[1]);
//    }

    public ArrayList<Deck> getLocationDeck() {
        ArrayList<Deck> result = new ArrayList<>();

        for (Deck deck : decks
        ) {
            result.add(deck);
        }
        return result;
    }

}
