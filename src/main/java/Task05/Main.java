package Task05;
import Task05.Unit.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int GANG_SIZE = 10;
    public static ArrayList<BaseHero> whiteSide;
    public static ArrayList<BaseHero> darkSide;

    public static void main(String[] args) {
        init();

        Scanner scanner = new Scanner(System.in);
        while (true){
            ArrayList<BaseHero> units = new ArrayList<>();
            units.addAll(whiteSide);
            units.addAll(darkSide);
            ConsoleView.view();
            units.forEach(n -> n.step(units));
            scanner.nextLine();
        }
    }


    private static void init(){
        whiteSide = new ArrayList<>();
        darkSide = new ArrayList<>();


        int x = 1;
        int y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {
            switch (new Random().nextInt(4)) {
                case 0: whiteSide.add(new Peasant(whiteSide,"WhiteUnit"+ i+1 , x, y++, "white")); break;
                case 1: whiteSide.add(new Robber(whiteSide,"WhiteUnit"+ i+1, x, y++, "white")); break;
                case 2: whiteSide.add(new Sniper(whiteSide,"WhiteUnit"+ i+1, x, y++, "white")); break;
                default: whiteSide.add(new Monk(whiteSide,"WhiteUnit"+ i+1, x, y++, "white")); break;
            }
        }

        x = GANG_SIZE;
        y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {

            switch (new Random().nextInt(4)) {
                case 0: darkSide.add(new Peasant(darkSide,"DarkUnit"+ i+1 , x, y++, "dark")); break;
                case 1: darkSide.add(new Spareman(darkSide,"DarkUnit"+ i+1,  x, y++, "dark")); break;
                case 2: darkSide.add(new Xbowman(darkSide,"DarkUnit"+ i+1, x, y++, "dark")); break;
                default: darkSide.add(new Wizard(darkSide,"DarkUnit"+ i+1, x, y++, "dark")); break;
            }
        }
    }
}
