package Task04.Unit;

import java.util.ArrayList;

public class Spareman extends BaseHero {
    public Spareman(ArrayList<BaseHero> heroList, String name, int x, int y){
        super(heroList, "Spearman", name, 4, 5,  new int[] {1, 3}, 10, 4, x,y);
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {


    }

    @Override
    public String toString() {
        return super.toString() + "\n" ;
    }
}

