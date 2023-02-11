package Task05.Unit;

import java.util.ArrayList;

public interface BaseInterface {

    void step(ArrayList<BaseHero> heroList);

    String getInfo();


    void getDamage(float attackPower);

    void plusSupply(ArrayList<BaseHero> heroList);
}
