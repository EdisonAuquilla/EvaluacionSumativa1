import java.util.Random;

public class RockPaperandScissors {

    public static void main(String[] args) {
        String[] options = {"rock", "paper", "scissors"};
        int victoryPlayer1 = 0;
        int victoryPlayer2 = 0;

        String[] plays = {"rock", "paper", "scissors", "rock", "scissors", "paper"};

        for (String choosePlayer1 : plays) {
            int result = playGame(options, choosePlayer1);
            if (result == 1) {
                victoryPlayer1++;
            } else if (result == -1) {
                victoryPlayer2++;
            }
        }

            System.out.println("Victory of player 1: " + victoryPlayer1);
            System.out.println("Victory of player 2: " + victoryPlayer2);

        if (victoryPlayer1 > victoryPlayer2) {
            System.out.println("the Player 1 wins "+ victoryPlayer1);
        } else if (victoryPlayer2 > victoryPlayer1) {
            System.out.println("the Player 2 wins "+ victoryPlayer2);
        } else {
            System.out.println("tie");
        }
    }

    public static int playGame(String[] options, String choosePlayer1) {
        Random random = new Random();
        int choosePlayer2 = random.nextInt(options.length);
        System.out.println("The player 1 choose: " + choosePlayer1);
        System.out.println("The player 2 choose: " + options[choosePlayer2]);

        if (choosePlayer1.equals(options[choosePlayer2])) {
            System.out.println("tie");
            return 0;
            } else if ((choosePlayer1.equals("rock") && options[choosePlayer2].equals("scissors")) ||
                (choosePlayer1.equals("paper") && options[choosePlayer2].equals("rock")) ||
                (choosePlayer1 .equals("scissors") && options [choosePlayer2].equals("paper"))) {
            System.out.println("Player 1");
            return 1;
        } else {
            System.out.println("Player 2");
            return -1;
        }
    }
}
