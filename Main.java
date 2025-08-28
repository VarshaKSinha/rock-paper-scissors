import java.util.Random;
import java.util.Scanner;

public class Main{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        // ROCK PAPER SCISSORS GAME
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] choices = {"ROCK", "PAPER", "SCISSORS"};
        String playerChoice;
        String computerChoice;
        String playAgain;

        do{
            System.out.println("\n************************************************");
            System.out.print("ENTER YOUR MOVE (ROCK, PAPER, SCISSORS): ");
            playerChoice = scanner.nextLine().toUpperCase();

            if(!playerChoice.equals("ROCK") &&
                    !playerChoice.equals("PAPER") &&
                    !playerChoice.equals("SCISSORS")){
                System.out.println("INVALID CHOICE");
            }

            computerChoice = choices[random.nextInt(choices.length)];
            System.out.println("COMPUTER CHOICE: " + computerChoice);
                
            if (playerChoice.equals(computerChoice)) {
                System.out.println("IT'S A TIE!");
            }
            else if((playerChoice.equals("ROCK") && computerChoice.equals("SCISSORS")) ||
                    (playerChoice.equals("SCISSORS") && computerChoice.equals("PAPER")) ||
                    (playerChoice.equals("PAPER") && computerChoice.equals("ROCK"))){
                System.out.println("YOU WIN!");
            }
            else{
                System.out.println("YOU LOSE!");
            }
            
            System.out.print("PLAY AGAIN (YES/NO): ");
            playAgain = scanner.nextLine().toUpperCase();

        }while(playAgain.equals("YES"));
        

        System.out.println("THANK YOU FOR PLAYING!!!");
        scanner.close();
    }
    
}