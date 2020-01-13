package chapter8.game;

public class MainBoardPlay {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        AdvancedPlayer advancedPlayer = new AdvancedPlayer();
        player.upgradeLevel(advancedPlayer);
        player.play(2);
    }
}
