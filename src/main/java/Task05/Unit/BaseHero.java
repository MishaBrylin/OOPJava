package Task05.Unit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class BaseHero implements BaseInterface {
    String name, clas, team;
    int attack, defence, speed, maxHealth;
    protected float health;

    int[] damage;
    protected Vector2 position;
    protected ArrayList<BaseHero> heroList;



    public BaseHero(ArrayList<BaseHero> heroList, String clas, String name, int attack, int defence, int[] damage,
                    int health, int speed, int x, int y, String team) {
        this.heroList = heroList;
        this.position = new Vector2(x,y);
        this.clas = clas;
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.maxHealth = health;
        this.health = maxHealth;
        this.speed = speed;
        this.team = team;
    }

    protected Vector2 getTarget(ArrayList<BaseHero> heroList) {
        float minDistance = 100;
        int minIndex = 0;
        for (int i = 0; i < heroList.size(); i++) {
            if (heroList.get(i).getTeam().equals(getTeam())) {
                continue;
            }
            float temp = getPosition().getDistance(heroList.get(0).getPosition().x, heroList.get(0).getPosition().y);
            if (temp < minDistance && heroList.get(i).health > 0) {
                minDistance = temp;
                minIndex = i;
            }
        }
        return new Vector2(minDistance, minIndex);
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {
    }
    @Override
    public String getInfo() {

            String outStr = String.format("Name: %-5s, class: %-5s, \t\t\t⚔%-3d\t\uD83D\uDEE1 %d,\t♥%d,\t⚡%d-%d, \t\uD83C\uDFC3 \t%d-10\t", name, clas, attack, defence, (int)health, damage[0], damage[1], speed);

        return outStr;
    }

    @Override
    public void getDamage(float attackPower) {
        this.health -= attackPower;
        if (this.health < 0) {
            this.health = 0;
        } else if (this.health > maxHealth) {
            this.health = maxHealth;
        }
    }

    public void plusSupply(ArrayList<BaseHero> heroList) {

    }

    public String getName() {
        return clas;
    }
    public Vector2 getPosition() {
        return position;
    }
    public int [] getHp(){

        return new int[] {maxHealth, (int) health};
    }
    public String getTeam() {
        return team;
    }



    @Override
    public String toString() {
        return "Class: " + clas + ", Name: " + name + ", Attack: " + attack + ", Defence: " + defence +
                ", Damage: " + Arrays.toString(damage) + ", Health: " + health +
                ", Speed: " + speed;
    }
}
