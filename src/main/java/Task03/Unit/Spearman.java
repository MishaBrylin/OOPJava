package Task03.Unit;

import java.util.ArrayList;

public class Spearman extends BaseHero {
    public Spearman(String name){
        super("Spearman", name, 4, 5,  new int[] {1, 3}, 10, 4);
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {


    }

    @Override
    public String toString() {
        return super.toString() + "\n" ;
    }
}

