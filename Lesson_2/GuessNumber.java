import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int numberToGuess = -1;
    private int startRange = 1;
    private int endRange = 100;
    
    public GuessNumber(Player player1, Player player2) {
        Random r = new Random();
        numberToGuess = r.nextInt(1, 100);

        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Player currentPlayer = player1;
        boolean isGameFinished;
        
        do {
            makeNextGuess(currentPlayer);
            isGameFinished = isGuessed(currentPlayer);
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        } while (!isGameFinished);
    }

    private void makeNextGuess(Player player) {
        player.setNumber((startRange + endRange) / 2);
    }

    public boolean isGuessed(Player currentPlayer) {
        int playerGuess = currentPlayer.getNumber();

        if (playerGuess == numberToGuess) {
            System.out.printf("%s, Вы победили! Загаданное число: %d%n%n",
                    currentPlayer.getName(), playerGuess);
            return true;
        }

        if (playerGuess < numberToGuess) {
            System.out.printf("%s, число %d меньше того, что загадал компьютер%n",
                    currentPlayer.getName(), playerGuess);
            startRange = playerGuess + 1;
        } else if (playerGuess > numberToGuess) {
            System.out.printf("%s, число %d больше того, что загадал компьютер%n",
                    currentPlayer.getName(), playerGuess);
            endRange = playerGuess - 1;
        }

        return false;
    }
}