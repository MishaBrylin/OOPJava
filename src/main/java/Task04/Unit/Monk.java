package Task04.Unit;

import java.util.ArrayList;

public class Monk extends Magics {
    public Monk(ArrayList<BaseHero> heroList, String name, int x, int y){
        super(heroList,"Monk", name, 12, 7, new int[] {-4, -4}, 30, 5, 1, x,y);
    }
    @Override
    public String toString() {
        return super.toString() + "\n" ;
    }
}
