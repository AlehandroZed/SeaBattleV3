import java.util.ArrayList;
import java.util.Random;

public class Enter {
     int SIZE = 10;
     int[][] grid = new int[SIZE][SIZE];
    ArrayList<Integer[][]> e = new ArrayList<>();

    public void newGrid() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                grid[i][j] = -1;
            }
        }
    }

    int[] xy = new int[2];


    public int[] enterCoordinate() {
        while (true) {
            Random random = new Random();
            int x = random.nextInt(10);
            int y = random.nextInt(10);
            if (grid[x][y] == 1) {
                continue;
            }
            xy[0] = x;
            xy[1] = y;
            grid[x][y] = 1;
            return xy;
        }
    }

    public void printGrid() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                String symbol = "-";
                if (grid[i][j] == 1) {
                    symbol = "+";
                }
                System.out.print(symbol+" ");
            }
            System.out.println();
        }
    }

}
