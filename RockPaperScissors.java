import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

  public static void main(String[] args) {
    // prompt the user for the selection - what are you going to play?
    Scanner playersInputScanner = new Scanner(System.in);
    System.out.println("Rock, paper, or scissors?");
    String playerSelection = playersInputScanner.nextLine().toLowerCase().trim();
    System.out.println("You entered: " + playerSelection);

    // did the user choose a valid play?
    while(!playerSelection.equals("rock") && !playerSelection.equals("paper") && !playerSelection.equals("scissors")) {
      System.out.println("Invalid selection. Please select rock, paper, or scissors");
      playerSelection = playersInputScanner.nextLine().trim();
    }

//    boolean invalid = false;
//    System.out.println("Rock, paper, or scissors?");
//    do {
//      playerSelection = playersInputScanner.nextLine().toLowerCase().trim();
//      System.out.println("You entered: " + playerSelection);
//      invalid = !playerSelection.equals("rock") && !playerSelection.equals("paper") && !playerSelection.equals("scissors");
//      if(invalid) {
//        System.out.println("Invalid selection. Please select rock, paper, or scissors");
//      }
//    } while(!playerSelection.equals("rock") && !playerSelection.equals("paper") && !playerSelection.equals("scissors"));
    // if invalid loop until we get a valid result
    // if valid, go on with the game

    // have the computer or program randomly select a play - rock, paper, or scissors
    Random random = new Random();
    int randomNum = random.nextInt(3);
    String computerSelection;
    if(randomNum == 0) {
      computerSelection = "rock";
    }
    else if(randomNum == 1) {
      computerSelection = "paper";
    }
    else {
      computerSelection = "scissors";
    }
    System.out.println("Computer chose: " + computerSelection);
    // use flow control to determine the winner
    String gameResult = "";
    if(playerSelection.equals(computerSelection)) {
      gameResult = "It's a tie";
    }
    else if(playerSelection.equals("rock")) {
      if(computerSelection.equals("paper")) {
        gameResult = "Computer wins";
      }
      else {
        gameResult = "Player wins";
      }
    }
    else if(playerSelection.equals("paper")) {
      if(computerSelection.equals("scissors")) {
        gameResult = "Computer wins";
      }
      else {
        gameResult = "Player wins";
      }
    }
    else if(playerSelection.equals("scissors")) {
      if(computerSelection.equals("rock")) {
        gameResult = "Computer wins";
      }
      else {
        gameResult = "Player wins";
      }
    }

    // output the winner
    System.out.println(gameResult);
  }
}