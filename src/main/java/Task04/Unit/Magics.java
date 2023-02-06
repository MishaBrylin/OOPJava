package Task04.Unit;

import java.util.ArrayList;
import java.util.Collections;

public class Magics extends BaseHero {
    int mana;
    public Magics(ArrayList<BaseHero> heroList, String clas, String name, int attack, int defence, int[] damage, int health, int speed, int mana, int x, int y) {
        super(heroList,  clas, name, attack, defence, damage, health, speed, x, y);
        this.mana = mana;
    }
    @Override
    public void step(ArrayList<BaseHero> heroList) {

        ArrayList<Double> perсentHp = new ArrayList<>();
        for (int i = 0; i < heroList.size(); i++) {
            double x;
            x = (heroList.get(i).getHp()[0]-heroList.get(i).getHp()[1])*100/heroList.get(i).getHp()[0];

            perсentHp.add(x);

        }

        int index = perсentHp.indexOf((Collections.max(perсentHp)));
        System.out.println("Лечится герой: " + heroList.get(index));

        heroList.get(index).health = heroList.get(index).maxHealth;




    }
    @Override
    public String toString() {
        return super.toString() + ", Mana: " + mana;
    }




}
