import java.util.ArrayList;
import java.util.List;

public class Player {
    Fleet fleet;
    String name;

    public Player() {
        this.name = "No mame user";
    }

    public void setFleet() {
        //**********
        fleet = new Fleet();
        //******************
        this.fleet.setUpFleet();
    }

    public void setName(String name) {
        this.name = name;
    }
}

