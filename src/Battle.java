public class Battle {
    public Battle(Hero hero, Monster monster) {
        this.hero = hero;
        this.monster = monster;
    }

    private final Hero hero;
    private final Monster monster;

    public void start() {
        new Thread(() -> {
            while (hero.health > 0 && monster.health > 0) {
                int heroDamage = hero.attack();
                if (heroDamage == 0) {
                    System.out.println(hero.name + " промахнулся");
                } else {
                    System.out.printf(hero.name + " нанес удар в размере %d единиц урона\n", heroDamage);
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
            if (hero.health <= 0) {
                System.out.println(hero.name + " погиб.");
            } else {
                System.out.println(monster + " побежден.");
                hero.gainExperience(monster.getExperience());
                hero.gainGold(monster.getGold());

            }
        }).start();
    }

}
