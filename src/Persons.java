public class Persons {

    public int health = 100;
    public int skill = 0;
    public int strength;
    public int experience;
    public int gold;

    public int getGold() {
        return gold;
    }

    public Persons(String persons) {

        health = 100;
        skill = 0;
        strength = 100;
        experience = 10;
        gold = 10;

    }

    public int getExperience() {
        return experience;
    }

    public int attack() {
        int random = (int) (Math.random() * 100);
        int damage = 0;
        if (skill * 3 > random) {
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
}
