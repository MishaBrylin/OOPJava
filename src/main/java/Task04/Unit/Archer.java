package Task04.Unit;

import java.util.ArrayList;

public class Archer extends BaseHero {
    int shoots;

    public Archer(ArrayList<BaseHero> heroList,String clas, String name, int attack, int defence, int[] damage, int health, int speed, int shoots, int x, int y) {
        super(heroList, clas, name, attack, defence, damage, health, speed, x, y);
        this.shoots = shoots;
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {
        for (int i = 0; i < heroList.size(); i++) {
            if (heroList.get(i).clas.equals("Farmer")){
                if (((Peasant)heroList.get(i)).supply > 0){
                    ((Peasant)heroList.get(i)).supply -=1;
                    System.out.println(this.name + " сделал выстрел, осталось " + this.shoots + " выстрелов - фермер дал стрелу" );
                    return;

                }

                }

            }
        this.shoots -= 1;
        System.out.println(this.name + " сделал выстрел, осталось " + this.shoots + " выстрелов" );
        System.out.println();

    }




    @Override
    public String toString() {
        return super.toString() + ", Shoots: " + shoots;
    }


}
