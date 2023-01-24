package Task01;

public class Monk extends Magics {
    public Monk(String name){
        super(name, 12, 7, new int[] {-4, -4}, 30, 5, 1);
    }
    @Override
    public String toString() {
        return "Class: Monk, " + super.toString() + "\n" ;
    }
}
