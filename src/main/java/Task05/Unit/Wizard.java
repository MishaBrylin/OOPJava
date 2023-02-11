package Task05.Unit;

import java.util.ArrayList;

public class Wizard extends Magics {
    public Wizard(ArrayList<BaseHero> heroList, String name, int x, int y, String team){
        super(heroList, "Mage", name, 17, 12, new int[] {-5, -5}, 30, 9, 1, x,y, team);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" ;
    }
}
