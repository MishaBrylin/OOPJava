package Task03;

import Task03.Unit.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<BaseHero> team1 = new ArrayList<>();
        ArrayList<BaseHero> team2 = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {

           int random = rand.nextInt(4);
            if (random == 0) {
                team2.add(new Crossbowman("UnitT2" + (i + 1)));
            }
            if (random == 2) {
                team1.add(new Farmer("UnitT1" + (i + 1)));
            }
            if (random == 3) {
                team1.add(new Mage("UnitT1" + (i + 1)));
            }
            if (random == 3) {
                team2.add(new Monk("UnitT2" + (i + 1)));
            }
            if (random == 1) {
                team1.add(new Rogue("UnitT1" + (i + 1)));
            }
            if (random == 0) {
                team1.add(new Sniper("UnitT1" + (i + 1)));
            }
            if (random == 1) {
                team2.add(new Spearman("UnitT2" + (i + 1)));
            }
            if (random == 2) {
                team2.add(new Farmer("UnitT2" + (i + 1)));
            }


        }
        team1.add(new Sniper("Valera"));
        System.out.println(team1);
        String x = "a";
        while (!x.equals("q")){

            team1.forEach(n-> n.step(team1));
            team1.forEach(n-> n.plusSupply(team1));
            System.out.println(team1);
            System.out.println("Для выхода нажмите q или нажмите что угодно для продолжение");
            Scanner iScanner = new Scanner(System.in);
            x = iScanner.nextLine();
        }


        System.out.println(team1);







    }
}
