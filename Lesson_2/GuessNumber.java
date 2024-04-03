import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Player moveOwner;
    private int numberToGuess = -1;
    private int startRange = 1;
    private int endRange = 100;
    
    public GuessNumber(Player player1, Player player2) {
        Random r = new Random();
        numberToGuess = r.nextInt(1, 100);

        this.player1 = player1;
        this.player2 = player2;
        moveOwner = player1;
    }

    public int getStartRange() {
        return startRange;
    }

    public int getEndRange() {
        return endRange;
    }

    public void startGame() {
        boolean isGameOver;
            do {
                moveOwner.makeNextGuess(this);
                isGameOver = move();
            } while (!isGameOver);
    }

    public boolean move() {
        if (moveOwner.getNumber() == numberToGuess) {
            System.out.printf("%s, Вы победили! Загаданное число: %d%n%n",
                    moveOwner.getName(), moveOwner.getNumber());
            return true;
        } else if (moveOwner.getNumber() < numberToGuess) {
            System.out.printf("%s, число %d меньше того, что загадал компьютер%n",
                    moveOwner.getName(), moveOwner.getNumber());
            startRange = moveOwner.getNumber() + 1;
        } else if (moveOwner.getNumber() > numberToGuess) {
            System.out.printf("%s, число %d больше того, что загадал компьютер%n",
                    moveOwner.getName(), moveOwner.getNumber());
            endRange = moveOwner.getNumber() - 1;
        }

        if (moveOwner == player1) {
            moveOwner = player2;
        } else {
            moveOwner = player1;
        }

        return false;
    }
}