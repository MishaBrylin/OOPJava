package Task06.units;

import java.util.ArrayList;

public class Rogue extends Melee {
    public Rogue(ArrayList<BaseHero> teamList, String name, int x, int y, String team, boolean status){
        super(teamList, name, "Rogue", "\uD83D\uDDE1️", 8, 3, new int[] {2, 4}, 10, 6, x, y, team, status);
    }
}