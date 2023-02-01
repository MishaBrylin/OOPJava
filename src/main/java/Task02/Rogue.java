package Task02;

import java.util.ArrayList;

public class Rogue extends BaseHero {
    public Rogue(String name){
        super("Rogue", name, 8, 3, new int[] {2, 4}, 10, 6);
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {


    }

    @Override
    public String toString() {
        return super.toString() + "\n" ;
    }
}
