import java.util.Random;
import java.util.Scanner;

class RockPaperScissors {
  public static void main(String[] args) {
    //prompt the user for their selection
    System.out.println("rock, paper, or scissors?");
    Scanner scanner = new Scanner(System.in);
    String userSelection = scanner.nextLine().toLowerCase();

    //validate the user's selection
    while (!userSelection.equals("rock") && !userSelection.equals("paper") && !userSelection.equals("scissors")) {
      System.out.println("Please enter rock, paper, or scissors?");
      userSelection = scanner.nextLine().toLowerCase();
    }

    scanner.close();

    System.out.println("You chose " + userSelection);

    //randomly generate the computer's selection
    String computerSelection = getComputerSelection();
    System.out.println("Computer chose " + computerSelection);

    //determine the winner and output results
    System.out.println(determineWinner(userSelection, computerSelection));
  }

  private static String getComputerSelection() {
    String computerSelection;
    Random random = new Random();
    int randomNum = random.nextInt(3);
    if (randomNum == 0) {
      computerSelection = "rock";
    } else if (randomNum == 1) {
      computerSelection = "paper";
    } else {
      computerSelection = "scissors";
    }
    return computerSelection;
  }

  private static String determineWinner(String userSelection, String computerSelection) {
    String gameResult = "";
    if (userSelection.equals(computerSelection)) {
      gameResult = "It's a tie!";
    } else if (userSelection.equals("rock")) {
      if (computerSelection.equals("paper")) {
        gameResult = "Computer wins!";
      } else {
        gameResult = "Player wins!";
      }
    } else if (userSelection.equals("paper")) {
      if (computerSelection.equals("scissors")) {
        gameResult = "Computer wins!";
      } else {
        gameResult = "Player wins!";
      }
    } else if (userSelection.equals("scissors")) {
      if (computerSelection.equals("rock")) {
        gameResult = "Computer wins!";
      } else {
        gameResult = "Player wins!";
      }
    }
    return gameResult;
  }
}