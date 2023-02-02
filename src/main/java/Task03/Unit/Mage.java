package Task03.Unit;

public class Mage extends Magics {
    public Mage(String name){
        super("Mage", name, 17, 12, new int[] {-5, -5}, 30, 9, 1);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" ;
    }
}
