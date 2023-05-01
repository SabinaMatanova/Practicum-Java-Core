public class Dealer {
    private int potion = 1000;
    private final Hero hero;
    private final Dealer dealer;

    public Dealer(Hero hero, Dealer dealer) {
        this.hero = hero;
        this.dealer = dealer;
    }

    public void sellPotion(){
        if(hero.getGold() >=10) {
            hero.setHealth(100);
            hero.setGold(hero.getGold() - 10);
        } else {
            System.out.println("недостаточно денег");
        }
    }
}
