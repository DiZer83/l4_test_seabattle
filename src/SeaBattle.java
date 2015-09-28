/**
 * Created by igor on 27.09.15.
 */
public class SeaBattle {
    public static void main(String[] args) { // должен быть коротким
        doGame();
    }

    private static void doGame() {
        Field field = new Field();
        Player player = new Player();

        field.init();
        field.setShip(4);

        System.out.println("GAME START");

        do {
            field.show();
            //int shoot =
            field.doShoot(player.getShoot());
        } while (field.isNotGameOver());
        field.show();
    }
}
// Игорь Шемякин:Single Responsibility Principle?

//todo DZ Павел_2:а может и сразу скормить методу выстрела