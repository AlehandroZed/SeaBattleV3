import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Game {
    Enter enter = new Enter();
    Random random = new Random();
    List<Ship> fleet = new ArrayList<>();
    int[] deck = new int[]{4, 3, 3, 2, 2, 2, 1, 1, 1, 1};
    List<String> names = new ArrayList<>(Arrays.asList("Black Perl", "Titanic", "Aurora", "Pharaoh", "beda", "Duncan", "Nautilus", "Pilgrim", "Secret", "Ghost"));

    private void setUpGame() {
        for (int i = 0; i < 10; i++) {
            Ship ship = new Ship();
            ship.setLocationDeck(deck[i]);
            ship.setName(names.get(random.nextInt(names.size())));
            fleet.add(ship);
        }
        fleet.get(8).decks.get(0).coordinates = new int[]{2, 2};// один корабль с координатами 2,2//TEST
        fleet.get(5).decks.get(0).coordinates = new int[]{7, 5};// один корабль с координатами 2,2//TEST
        fleet.get(5).decks.get(1).coordinates = new int[]{8, 5};// один корабль с координатами 2,2//TEST

    }

    private void printGame() {
        for (Ship ship : fleet) {
            System.out.printf("%2s  ", ship.name);
            for (Deck deck : ship.getLocationDeck()
            ) {
                System.out.print(Arrays.toString(deck.getCoordinates()));
            }
            System.out.println();
        }
    }

    public void startPlaying() {
        int[][] coor = new int[][]{{2, 2}, {7, 5}, {8, 5}, {0, 0}};// ввод пользователя //TEST

        checkingTheAttempt(coor);
    }

    private void checkingTheAttempt(int[][] coor) {
        for (int s = 0; s < coor.length; s++) {
            int[] enter = coor[s]; //TEST

            System.out.println("Ход: " + enter[0] + " " + enter[1]);
            String result = "Мимо!";

            for (int i = 0; i < fleet.size(); i++) {
                Ship ship = fleet.get(i);
                ArrayList<Deck> locationDeck = ship.getLocationDeck();
                for (Deck deck : locationDeck) {
                    if (Arrays.equals(deck.getCoordinates(), enter)) {
                        ship.decks.remove(deck);
                        result = "Попал!";
                        if (ship.decks.size() == 0) {
                            result = "Корабль " + ship.name + " потоплен!";
                            fleet.remove(ship);
                        }
                    }
                }
            }
            System.out.println(result);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("\n----------------------------Player 1\n");
        Game gamePlayer1 = new Game();
        gamePlayer1.setUpGame();
        gamePlayer1.startPlaying();
        gamePlayer1.printGame();

        System.out.println("\n-----------------------------Player 2\n");
        Game gamePlayer2 = new Game();
        gamePlayer2.setUpGame();
        gamePlayer2.startPlaying();
        gamePlayer2.printGame();

    }


}
