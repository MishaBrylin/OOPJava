package Task03.Unit;

import java.util.ArrayList;

public class  Farmer extends BaseHero {
    int supply;

    public Farmer(String clas, String name, int attack, int defence, int[] damage, int health, int speed, int supply) {
        super(clas, name, attack, defence, damage, health, speed);
        this.supply = supply;
    }

    public Farmer(String name){
        super("Farmer", name, 1, 1, new int[] {1, 1}, 1, 3);
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
