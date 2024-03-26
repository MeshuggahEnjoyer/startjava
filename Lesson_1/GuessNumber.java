public class GuessNumber {
    public static void main(String[] args) {
        int num = 13;
        int userGuess = 50;
        int startRange = 1;
        int endRange = 100;
        int numOfTries = 0;
        boolean isRightGuess = false;

        while (!isRightGuess) {
            numOfTries++;

            if (userGuess == num) {
                isRightGuess = true;
                break;
            } else if (userGuess < num) {
                System.out.printf("Число %d меньше того, что загадал компьютер%n", userGuess);
                startRange = userGuess + 1;
            } else if (userGuess > num) {
                System.out.printf("Число %d больше того, что загадал компьютер%n", userGuess);
                endRange = userGuess - 1;
            }

            userGuess = (startRange + endRange) / 2;
        }

        System.out.printf("Вы победили! Загаданное число: %d Кол-во попыток: %d%n",
                userGuess, numOfTries);
    }
}