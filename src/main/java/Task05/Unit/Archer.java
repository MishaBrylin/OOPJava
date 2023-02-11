package Task05.Unit;

import java.util.ArrayList;

public class Archer extends BaseHero {
    int shoots;

    public Archer(ArrayList<BaseHero> heroList, String clas, String name, int attack, int defence, int[] damage, int health, int speed, int shoots, int x, int y, String team) {
        super(heroList, clas, name, attack, defence, damage, health, speed, x, y, team);
        this.shoots = shoots;
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {
        if (health == 0){
            return;
        }
        Vector2 target = getTarget(heroList);
        float constMin = 12;
        float constMax = 4;

        float attackPower;
        if (target.x <= constMax) {
            attackPower = damage[1];

        } else if (target.x >= constMin) {
            attackPower = damage[0];
        } else {
            attackPower = damage[0] + ((target.x - constMax) / (constMin - constMax)) * (damage[1] - damage[0]);
        }
        for (int i = 0; i < heroList.size(); i++) {


            if (heroList.get(i).clas.equals("Peasant")){
                if (((Peasant)heroList.get(i)).supply > 0){
                    heroList.get((int) target.y).getDamage(attackPower);
                    ((Peasant)heroList.get(i)).supply -=1;
                    System.out.println(this.name + " сделал выстрел, осталось " + this.shoots + " выстрелов - фермер дал стрелу" );
                    return;

                }

                }

            }
        this.shoots -= 1;
        heroList.get((int) target.y).getDamage(attackPower);
        System.out.println(this.name + " сделал выстрел, осталось " + this.shoots + " выстрелов" );
        System.out.println();

    }




    @Override
    public String toString() {
        return super.toString() + ", Shoots: " + shoots;
    }


}
