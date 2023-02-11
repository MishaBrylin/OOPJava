package Task05.Unit;

import java.util.ArrayList;

public class Spareman extends BaseHero {
    public Spareman(ArrayList<BaseHero> heroList, String name, int x, int y, String team){
        super(heroList, "Spearman", name, 4, 5,  new int[] {1, 3}, 10, 4, x,y, team);
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {


    }

    @Override
    public String toString() {
        return super.toString() + "\n" ;
    }
}

