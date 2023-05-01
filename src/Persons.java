import java.util.Random;

public abstract class Persons {

    private int health = 100;
    private int skill = 10;
    private int strength;
    private int experience;
    private int gold;
    private String name;


    public Persons(String name, int gold) {

        health = 100;
        skill = 10;
        strength = 100;
        experience = 5;
        this.name = name;
        this.gold = gold;


    }

    public int getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int attack() {
        Random random = new Random();
        int roll = random.nextInt(100);
        int damage = 0;
        if (skill * 3 > roll) {
            damage = strength;
        }
        return damage;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }
    @Override
    public String toString() {
        return String.format("%s здоровье:%d", name, health);
    }
}
