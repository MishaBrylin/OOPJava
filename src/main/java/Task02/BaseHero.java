package Task02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class BaseHero implements BaseInterface {
    String name, clas;
    int attack, defence, health, speed, maxHealth;
    int[] damage;

    public BaseHero(String clas, String name, int attack, int defence, int[] damage,
                    int health, int speed) {
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
        return clas;
    }
    @Override
    public void heal() {
        this.health = new Random().nextInt(1,maxHealth-this.health) + this.health;


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
