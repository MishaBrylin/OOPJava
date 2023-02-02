package Task03.Unit;

public class Sniper extends Archer {
    public Sniper(String name) {
        super("Sniper", name, 12, 10, new int[]{8, 10}, 15, 9, 32);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" ;
    }
}
