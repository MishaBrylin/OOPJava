package Task04.Unit;

import java.util.ArrayList;

public class Robber extends BaseHero {
    public Robber(ArrayList<BaseHero> heroList, String name, int x, int y){
        super(heroList, "Robber", name, 8, 3, new int[] {2, 4}, 10, 6, x,y);
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {


    }

    @Override
    public String toString() {
        return super.toString() + "\n" ;
    }
}
