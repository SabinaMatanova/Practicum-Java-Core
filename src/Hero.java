public class Hero extends Persons {

    private int experience;

    public Hero(String name) {
        super(name, 0);
        experience = 0;
    }

    public void gainExperience (int experience) {
        setExperience(getExperience() + experience);
        System.out.printf(getName() + " получил опыт в размере %d условных единиц.\n", experience);
    }

    public void gainGold (int gold) {
        setGold(getGold() + gold);
        System.out.printf(getName() + " получил золото в размере %d условных единиц.\n", gold);
    }
}
