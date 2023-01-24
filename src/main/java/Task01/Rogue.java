package Task01;

public class Rogue extends BaseHero {
    public Rogue(String name){
        super(name, 8, 3, new int[] {2, 4}, 10, 6);
    }
    @Override
    public String toString() {
        return "Class: Rogue, " + super.toString() + "\n" ;
    }
}
