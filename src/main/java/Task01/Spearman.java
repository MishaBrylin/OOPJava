package Task01;

public class Spearman extends BaseHero {
    public Spearman(String name){
        super(name, 4, 5, new int[] {1, 3}, 10, 4);
    }

    @Override
    public String toString() {
        return "Class: Spearman, " + super.toString() + "\n" ;
    }
}

