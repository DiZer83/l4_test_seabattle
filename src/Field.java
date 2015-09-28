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
        return cells[ship.position] == 'X';
    }

    void setShip(int position) {
        cells[position] = 'X';
        ship = new Ship();
        ship.position = position;
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
                System.out.println("Корабль потоплен");
                cells[shoot] = '@';
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
