package Task04.Unit;

import java.util.ArrayList;

public class Sniper extends Archer {
    public Sniper(ArrayList<BaseHero> heroList, String name, int x, int y) {
        super(heroList, "Sniper", name, 12, 10, new int[]{8, 10}, 15, 9, 32, x,y);

    }

    @Override
    public String toString() {
        return super.toString() + "\n" ;
    }
}
