import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Fleet {
    Random random = new Random();
    List<Ship> fleet = new ArrayList<>();
    int[] numberOfDeckAtShipList = new int[]{4, 3, 3, 2, 2, 2, 1, 1, 1, 1};
    List<String> namesShipList = new ArrayList<>(Arrays.asList("Black Perl", "Titanic", "Aurora", "Pharaoh", "beda", "Duncan", "Nautilus", "Pilgrim", "Secret", "Ghost"));

    public void setUpFleet() {
        for (int i = 0; i < 10; i++) {
            //***********************
            Ship ship = new Ship();
            //**************************
            ship.setLocationShip(numberOfDeckAtShipList[i]);
            ship.setName(namesShipList.get(random.nextInt(namesShipList.size())));
            fleet.add(ship);
        }
        fleet.get(8).decks.get(0).coordinates = new int[]{2, 2};// один корабль с координатами 2,2//TEST
        fleet.get(5).decks.get(0).coordinates = new int[]{7, 5};// один корабль с координатами 2,2//TEST
        fleet.get(5).decks.get(1).coordinates = new int[]{8, 5};// один корабль с координатами 2,2//TEST

    }
}
