import java.util.Scanner;

/**
 * Created by igor on 27.09.15.
 */
public class Player {
    //String name; //Имя игрока

    int getShoot() {
        int shoot;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Сделайте выстрел (от 1 до 10): ");

            if (scanner.hasNextInt()) {
                shoot = scanner.nextInt(); // обрез бумаги
                break;
            } else {
                System.out.println("Введите целое число");
                scanner.nextLine(); // выбросили
            }
        } while (true);
        //System.out.println("X: " + shoot);
        return shoot;
    }
}
