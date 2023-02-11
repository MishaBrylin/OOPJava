package Task04.Unit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class BaseHero implements BaseInterface {
    String name, clas;
    int attack, defence, health, speed, maxHealth;
    int[] damage;
    protected Vector2 position;
    protected ArrayList<BaseHero> heroList;



    public BaseHero(ArrayList<BaseHero> heroList, String clas, String name, int attack, int defence, int[] damage,
                    int health, int speed, int x, int y) {
        this.heroList = heroList;
        this.position = new Vector2(x,y);
        this.clas = clas;
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.maxHealth = health;
        this.health = maxHealth- new Random().nextInt(maxHealth);
        this.speed = speed;
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {
    }
    @Override
    public String getInfo() {

            String outStr = String.format("Name: %-5s, class: %-5s, \t\t\t⚔%-3d\t\uD83D\uDEE1 %d,\t♥%d-3,\t⚡%d-%d-3, \t\uD83C\uDFC3 \t%d-10\t", name, clas, attack, defence,health, damage[0], damage[1], speed);

        return outStr;
    }

    @Override


    public void plusSupply(ArrayList<BaseHero> heroList) {

    }

    public String getName() {
        return clas;
    }
    public Vector2 getPosition() {
        return position;
    }
    public int [] getHp(){

        return new int[] {maxHealth, health};
    }




    @Override
    public String toString() {
        return "Class: " + clas + ", Name: " + name + ", Attack: " + attack + ", Defence: " + defence +
                ", Damage: " + Arrays.toString(damage) + ", Health: " + health +
                ", Speed: " + speed;
    }
}
