package Task01;

import java.util.List;
import java.util.*;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> crossbowman = new ArrayList<>();
        ArrayList<BaseHero> farmer = new ArrayList<>();
        ArrayList<BaseHero> mage = new ArrayList<>();
        ArrayList<BaseHero> monk = new ArrayList<>();
        ArrayList<BaseHero> rogue = new ArrayList<>();
        ArrayList<BaseHero> sniper = new ArrayList<>();
        ArrayList<BaseHero> spearman = new ArrayList<>();
        ArrayList<BaseHero> allUnit = new ArrayList<>();


        Random rand = new Random();

        for (int i = 0; i < 50; i++) {

           int random = rand.nextInt(7);
            if (random == 0) {
                crossbowman.add(new Crossbowman("Unit" + (i + 1)));
                allUnit.add(new Crossbowman("Unit" + (i + 1)));
            }
            if (random == 1) {
                farmer.add(new Farmer("Unit" + (i + 1)));
                allUnit.add(new Farmer("Unit" + (i + 1)));
            }
            if (random == 2) {
                mage.add(new Mage("Unit" + (i + 1)));
                allUnit.add(new Mage("Unit" + (i + 1)));
            }
            if (random == 3) {
                monk.add(new Monk("Unit" + (i + 1)));
                allUnit.add(new Monk("Unit" + (i + 1)));
            }
            if (random == 4) {
                rogue.add(new Rogue("Unit" + (i + 1)));
                allUnit.add(new Rogue("Unit" + (i + 1)));
            }
            if (random == 5) {
                sniper.add(new Sniper("Unit" + (i + 1)));
                allUnit.add(new Sniper("Unit" + (i + 1)));
            }
            if (random == 6) {
                spearman.add(new Spearman("Unit" + (i + 1)));
                allUnit.add(new Spearman("Unit" + (i + 1)));
            }


        }
        System.out.println(allUnit);

        System.out.println(crossbowman);



    }
}
