import java.util.Random;

/**
 * Created by igor on 27.09.15.
 */
public class Field {
    char[] cells = new char[10];
    Ship ship;

    void init() { // clear, fill, redraw, init
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }
    }

    boolean isNotGameOver() {
        return ship.hp > 0;//cells[ship.position] == 'X';
    }

    void setShip() {
        Random random = new Random();
        ship = new Ship();
        ship.position = random.nextInt(11 - ship.hp); // Позиция первой палубы

        for (int i = ship.position; i < ship.position + ship.hp; i++) {
            cells[i] = 'X';
        }
    }

    void show() {
        System.out.println(cells);
        System.out.println();
    }

    void doShoot(int shoot) { // aiming
        switch (cells[shoot]) {
            case '.':
                System.out.println("Промах");
                cells[shoot] = '*';
                break;
            case '*':
                System.out.println("Уже стреляли");
                break;
            case 'X':
                ship.hp--;
                cells[shoot] = '@';
                if (ship.hp > 0) {
                    System.out.println("Попал");
                } else {
                    System.out.println("Потоплен");
                }
                break;
            case '@':
                System.out.println("В эту палубу уже было попадание");
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
