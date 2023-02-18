package Task06.units;

import java.util.ArrayList;

public class Monk extends Healers {
    public Monk(ArrayList<BaseHero> teamList, String name, int x, int y, String team, boolean status){
        super(teamList, name, "Monk", "\uD83E\uDDD9\u200D♂️",12, 7, new int[] {-4, -4}, 30, 5, 1, x, y, team, status);
    }

}