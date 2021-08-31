import java.util.Random;
import java.util.Scanner;
public class GuessMeFinally {
    final static int MAX = 100;
    final static int MIN = -100;
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);
        Random randomGen = new Random();

        //Random number between range MIN to MAX
        int randomNumber = randomGen.nextInt(MAX-(-MIN)+1) + (-MIN);
        int guess;
        boolean keepGuessing = true;
        //System.out.println(randomNumber);

        System.out.println("I've chosen a number between -100 and 100. Betcha can't guess it!\n");


        //Loop getting input from user until the guess matches the random number.
        do{
            guess = getIntFromUser(inputReader, "your guess");

            if (guess < randomNumber) System.out.println("Ha, nice try - too low! Try again!\n");
            else if (guess > randomNumber) System.out.println("Too bad, way too high. Try again!\n");
            else{
                keepGuessing=false;
                System.out.println("Finally! It's about time you got it!");
                // break;
            }

        }while(keepGuessing==true);

        inputReader.close();

    }


/**
 * Helper Method to get a valid integer input from user
 * @param sc
 * @param prompt :
 * @return an integer from scanner.
 */
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
