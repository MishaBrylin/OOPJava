package Task04.Unit;

import java.util.ArrayList;

public class Peasant extends BaseHero {
    int supply;

    public Peasant(ArrayList<BaseHero> heroList, String clas, String name, int attack, int defence, int[] damage, int health, int speed, int x, int y) {
        super(heroList, clas, name, attack, defence, damage, health, speed, x, y);
        this.supply = supply;
    }

    public Peasant(ArrayList<BaseHero> heroList, String name, int x, int y){
        super(heroList, "Peasant", name, 1, 1, new int[] {1, 1}, 1, 3, x, y);
        this.supply = 1;
    }


    @Override
    public void step(ArrayList<BaseHero> heroList) {


    }
    @Override
    public void plusSupply(ArrayList<BaseHero> heroList) {
        for (int i = 0; i < heroList.size(); i++) {
            this.supply =1;

        }


    }

    @Override
    public String toString() {
        return super.toString() + ", Supply: " + supply  + "\n";
    }
}
