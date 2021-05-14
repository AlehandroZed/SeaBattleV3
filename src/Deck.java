import java.util.Arrays;
import java.util.Random;

public class Deck {
    int[] coordinates = new int[2];

    Enter enter;






    public void setCoordinates(int [] coordinates) {
        this.coordinates = coordinates;
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

