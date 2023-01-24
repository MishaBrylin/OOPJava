package Task01;

public class Mage extends Magics {
    public Mage(String name){
        super(name, 17, 12, new int[] {-5, -5}, 30, 9, 1);
    }
    @Override
    public String toString() {
        return "Class: Mage, " + super.toString() + "\n" ;
    }
}
