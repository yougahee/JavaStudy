package chapter8.game;

public class Player {

    private PlayerLevel playerLevel;

    public Player() {
        playerLevel = new BeginnerPlayer();
        playerLevel.showLevelMessage();
    }

    public PlayerLevel getPlayerLevel() {
        return playerLevel;
    }

    public void upgradeLevel(PlayerLevel playerLevel) {
        this.playerLevel = playerLevel;
        playerLevel.showLevelMessage();
    }

    public void play(int count) {
        playerLevel.go(count);
    }





}
