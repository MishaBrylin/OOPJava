package Task04.Unit;

import java.util.ArrayList;

public class Wizard extends Magics {
    public Wizard(ArrayList<BaseHero> heroList, String name, int x, int y){
        super(heroList, "Mage", name, 17, 12, new int[] {-5, -5}, 30, 9, 1, x,y);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" ;
    }
}
