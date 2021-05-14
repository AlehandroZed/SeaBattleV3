import java.util.Arrays;
import java.util.Random;

public class Deck {
    int[] coordinates = new int[2];

    public void setCoordinates(Enter enter) {
        this.coordinates = enter.enterCoordinate();
    }

    public int[] getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "coordinates=" + Arrays.toString(coordinates) +
                '}';
    }
}

