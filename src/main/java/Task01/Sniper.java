package Task01;

public class Sniper extends Archer {
    public Sniper(String name) {
        super(name, 12, 10, new int[]{8, 10}, 15, 9, 32);
    }
    @Override
    public String toString() {
        return "Class: Sniper, " + super.toString() + "\n" ;
    }
}
