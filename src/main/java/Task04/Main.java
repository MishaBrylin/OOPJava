package Task04;
import Task04.*;
import Task04.Unit.*;

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

            ConsoleView.view();
            whiteSide.forEach(n -> n.step(darkSide));
            darkSide.forEach(n -> n.step(whiteSide));
            scanner.nextLine();
        }
    }


    private static void init(){
        whiteSide = new ArrayList<>();
        darkSide = new ArrayList<>();
        Random rand = new Random();

        int x = 1;
        int y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {
            switch (new Random().nextInt(4)) {
                case 0: whiteSide.add(new Peasant(whiteSide,"WhiteUnit"+ i+1 , x, y++)); break;
                case 1: whiteSide.add(new Robber(whiteSide,"WhiteUnit"+ i+1, x, y++)); break;
                case 2: whiteSide.add(new Sniper(whiteSide,"WhiteUnit"+ i+1, x, y++)); break;
                default: whiteSide.add(new Monk(whiteSide,"WhiteUnit"+ i+1, x, y++)); break;
            }
        }

        x = GANG_SIZE;
        y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {

            switch (new Random().nextInt(4)) {
                case 0: darkSide.add(new Peasant(darkSide,"DarkUnit"+ i+1 , x, y++)); break;
                case 1: darkSide.add(new Spareman(darkSide,"DarkUnit"+ i+1,  x, y++)); break;
                case 2: darkSide.add(new Xbowman(darkSide,"DarkUnit"+ i+1, x, y++)); break;
                default: darkSide.add(new Wizard(darkSide,"DarkUnit"+ i+1, x, y++)); break;
            }
        }
    }
}
