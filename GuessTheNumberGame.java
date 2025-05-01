import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int attempts = 5;
        boolean hasWon = false;

        System.out.println("Welcome to the Guess the Number Game");
        System.out.println("I have selected a number between 1 to 100.");
        System.out.println("You got " + attempts + " attempts to guess the number, Good Luck ;)");

        for(int i = 1; i <= attempts; i++){
            System.out.print("Attempt " + i + " Enter the number : ");
            int userGuess = scanner.nextInt();

            if(userGuess == randomNumber){
                hasWon = true;
                break;
            }
            else if(userGuess < randomNumber){
                System.out.println("Higher!");
            }
            else{
                System.out.println("Lower");
            }
            
        }

        if(hasWon){
            System.out.println("Congratulation you guessed the number");
        }
        else{
            System.out.println("Sorry, you've used all your attempts. The number is " + randomNumber);
        }


        scanner.close();
    }
    
}
