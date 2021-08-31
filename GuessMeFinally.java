import java.util.Random;
import java.util.Scanner;
public class GuessMeFinally {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);
        Random rng = new Random();
        int randomNumber = rng.nextInt(100-(-100)) + (-100);
        //System.out.println(randomNumber);
        int guess;
        boolean foundNumber = false;
        System.out.println("I've chosen a number between -100 and 100. Betcha can't guess it!\n");

        do{
            guess = getIntFromUser(inputReader, "your guess");

            if (guess < randomNumber) System.out.println("Ha, nice try - too low! Try again!\n");
            else if (guess > randomNumber) System.out.println("Too bad, way too high. Try again!\n");
            else{
                foundNumber=true;
                System.out.println("Finally! It's about time you got it!");
                // break;
            }

        }while(foundNumber==false);

        inputReader.close();

    }
    public static int getIntFromUser(Scanner sc, String prompt){
        int value;
        do {
            System.out.printf("Please enter %s: ",prompt);
            try {
                value = Integer.parseInt(sc.nextLine());
                break;
 
            } catch(NumberFormatException ex) {
                System.out.println("Please input a correct value.");
            }
        }while(true);
        return value;
    }
    
}
