package Task05.Unit;

import java.util.ArrayList;

public class Xbowman extends Archer {
    public Xbowman(ArrayList<BaseHero> heroList, String name, int x, int y, String team) {
        super(heroList, "Crossbowman", name, 12, 10, new int[]{8, 10}, 15, 9, 16, x,y, team);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" ;
    }
}

