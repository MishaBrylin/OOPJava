package Task03.Unit;

public class Crossbowman extends Archer {
    public Crossbowman(String name) {
        super("Crossbowman", name, 12, 10, new int[]{8, 10}, 15, 9, 16);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" ;
    }
}

