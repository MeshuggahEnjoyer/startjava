public class Player {
    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void makeNextGuess(GuessNumber currentGame) {
        number = (currentGame.getStartRange() + currentGame.getEndRange()) / 2;
    }
}