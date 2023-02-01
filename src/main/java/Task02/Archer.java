package Task02;

import java.util.ArrayList;

public class Archer extends BaseHero {
    int shoots;

    public Archer(String clas, String name, int attack, int defence, int[] damage, int health,
                  int speed, int shoots) {
        super(clas, name, attack, defence, damage, health, speed);
        this.shoots = shoots;
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {


    }

    @Override
    public String toString() {
        return super.toString() + ", Shoots: " + shoots;
    }


}
