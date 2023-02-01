package Task02;

public class Monk extends Magics {
    public Monk(String name){
        super("Monk", name, 12, 7, new int[] {-4, -4}, 30, 5, 1);
    }
    @Override
    public String toString() {
        return super.toString() + "\n" ;
    }
}
