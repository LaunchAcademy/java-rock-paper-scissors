import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

  public static void main(String[] args) {
    System.out.println("Please enter Rock, Paper, or Scissors");
    Scanner scanner = new Scanner(System.in);
    String playerSelection = scanner.nextLine().trim().toLowerCase();

    while (!playerSelection.equals("rock") && !playerSelection.equals("paper")
        && !playerSelection.equals("scissors")) {
      System.out.println("Invalid Selection, please enter Rock, Paper, or Scissors");
      playerSelection = scanner.nextLine().trim().toLowerCase();
    }

    Random random = new Random();
    int randomNum = random.nextInt(3);
    String computerSelection;

    if (randomNum == 0) {
      computerSelection = "rock";
    } else if (randomNum == 1) {
      computerSelection = "paper";
    } else {
      computerSelection = "scissors";
    }

    String result;

    if (playerSelection.equals(computerSelection)) {
      result = "Game was a tie!";
    } else if (playerSelection.equals("rock")) {
      if (computerSelection.equals("paper")) {
        result = "Computer wins!";
      } else {
        result = "Player wins!";
      }

    } else if (playerSelection.equals("paper")) {
      if (computerSelection.equals("scissors")) {
        result = "Computer wins!";
      } else {
        result = "Player wins!";
      }
    } else {
      if (computerSelection.equals("rock")) {
        result = "Computer wins!";
      } else {
        result = "Player wins!";
      }
    }

    System.out.println("Player Selection: " + playerSelection);
    System.out.println("Computer Selection: " + computerSelection);
    System.out.println(result);

  }
}