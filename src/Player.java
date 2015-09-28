import java.util.Scanner;

/**
 * Created by igor on 27.09.15.
 */
public class Player {
    String name;

    int getShoot() {
        int shoot;

        Scanner scanner = new Scanner(System.in);
        do {
            if (scanner.hasNextInt()) {
                shoot = scanner.nextInt(); // обрез бумаги
                break;
            } else {
                System.out.println("введите все же число, плиз");
                scanner.nextLine(); // выборосили
            }
        } while (true);
        System.out.println("X: " + shoot);
        return shoot;
    }
}
