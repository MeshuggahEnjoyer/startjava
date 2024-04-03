import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());

        String playerAnswer;
        do {
            GuessNumber game = new GuessNumber(player1, player2);
            game.startGame();

            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                playerAnswer = scanner.next();
            } while (!(playerAnswer.equals("yes") || playerAnswer.equals("no")));
        } while (playerAnswer.equals("yes"));
    }
}