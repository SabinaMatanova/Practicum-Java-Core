public class Hero extends Persons {

    String name;


    public Hero(Hero hero, String name) {
        super();
        this.name = name;
        experience = 0;
        gold = 0;
    }

    public void gainExperience (int experience) {
        this.experience += experience;
        System.out.printf(name + " получил опыт в размере %d условных единиц.\n", experience);
    }

    public void gainGold (int gold) {
        this.gold += gold;
        System.out.printf(name + " получил золото в размере %d условных единиц.\n", gold);
    }
}
