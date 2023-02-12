package Task06.chars;


import java.util.List;

public class Peasant extends Base {
    public Peasant(List<Base> gang, int x, int y, int amount, String heroName) {
        super(1, 1, 0, new int[]{1,1}, 1,1, 3, true, false, "Peasant", heroName);
        super.gang = gang;
        super.position = new Vector2(x, y);
        super.amount = amount;
    }

    @Override
    public void Step(List<Base> group) {
        if(this.status.equals("dead")) return;
        if(status.equals("used")) status = "stand";
    }


}
