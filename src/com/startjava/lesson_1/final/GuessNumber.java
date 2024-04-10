public class GuessNumber {
    public static void main(String[] args) {
        int numToGuess = 13;
        int playerGuess = 50;
        int startRange = 1;
        int endRange = 100;

        while (playerGuess != numToGuess) {
            if (playerGuess < numToGuess) {
                System.out.printf("Число %d меньше того, что загадал компьютер%n", playerGuess);
                startRange = playerGuess + 1;
            } else if (playerGuess > numToGuess) {
                System.out.printf("Число %d больше того, что загадал компьютер%n", playerGuess);
                endRange = playerGuess - 1;
            }
            playerGuess = (startRange + endRange) / 2;
        }

        System.out.printf("Вы победили! Загаданное число: %d%n", playerGuess);
    }
}