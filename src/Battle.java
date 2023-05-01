public class Battle {
    private final Hero hero;
    private final Monster monster;

    public Battle(Hero hero, Monster monster) {
        this.hero = hero;
        this.monster = monster;
    }

    public void start() {
        new Thread(() -> {
            while (hero.getHealth() > 0 && monster.getHealth() > 0) {
                int heroDamage = hero.attack();
                if (heroDamage == 0) {
                    System.out.println(hero.getName() + " промахнулся");
                } else {
                    System.out.printf(hero.getName() + " нанес удар в размере %d единиц урона\n", heroDamage);
                    monster.takeDamage(heroDamage);
                }
                int monsterDamage = monster.attack();
                if (monsterDamage == 0){
                    System.out.println(monster + " промахнулся");
                } else {
                    System.out.printf(monster + " нанес удар в размере %d единиц урона\n", monsterDamage);
                }
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            if (hero.getHealth() <= 0) {
                System.out.println(hero.getName() + " погиб.");
            } else {
                System.out.println(monster + " побежден.");
                hero.gainExperience(monster.getExperience());
                hero.gainGold(monster.getGold());
                System.out.println(hero.getName() + ": " + hero.getHealth() + " здоровье, " + hero.getExperience() + " опыт, " + hero.getGold() + " золото.");

            }
        }).start();
    }

}
