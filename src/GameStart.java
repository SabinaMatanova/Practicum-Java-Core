import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameStart {
    private static BufferedReader br;
    private static Hero hero = null;
    private static Battle battle;

    public static void main(String[] args) {
        br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите имя персонажа:");
        try {
            command(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private static void command(String string) throws IOException {
        if (hero == null) {
            hero = new Hero(string);
            System.out.println(String.format("Спасити наш мир от монстров вызвался %s! Удачи!", hero.getName()));
            printNavigation();
        }
        switch (string) {
            case "1": {
                System.out.println("Торговец еще не приехал.");
                command(br.readLine());
            }
            case "2": {
                Battle battle = new Battle(hero, new Skeleton());
                battle.start();
                System.err.println("батл начался");
            }
            case "3": {
                System.exit(1);
            }
        }
        command(br.readLine());
    }

    private static void printNavigation() {
        System.out.println("Куда вы хотите пойти?");
        System.out.println("1. К Торговцу");
        System.out.println("2. В темный лес");
        System.out.println("3. Выход");
    }
}


