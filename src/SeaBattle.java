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
        field.setShip();

        System.out.println("GAME START");
        do {
            field.show();
            field.doShoot(player.getShoot() - 1);
        } while (field.isNotGameOver());
        field.show();
    }
}