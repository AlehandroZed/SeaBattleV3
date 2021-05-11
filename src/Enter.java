import java.util.ArrayList;
import java.util.Random;

public class Enter {
    int SIZE =10;
    int [][] grid =new int[SIZE][SIZE];
    int[] xy = new int[2];


    public int[] enterCoordinate() {
        Random random = new Random();
        xy[0] = random.nextInt(10);
        xy[1] = random.nextInt(10);
        return xy;
    }
}
