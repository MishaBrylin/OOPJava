package Task01;

public class Crossbowman extends Archer {
    public Crossbowman(String name) {
        super(name, 12, 10, new int[]{8, 10}, 15, 9, 16);
    }

    @Override
    public String toString() {
        return "Class: Crossbowman, " + super.toString() + "\n" ;
    }
}

