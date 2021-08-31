import java.util.Random;
import java.util.Scanner;
public class GuessMeFinally {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);
        Random rng = new Random();;
        int max = 100;
        int min = -100;
        int randomNumber = rng.nextInt(max-(min)+1) + (min);
        int guess;
        boolean keepGuessing = false;
        //System.out.println(randomNumber);

        int guessCount = 0;
        System.out.println(randomNumber);
        System.out.printf("I've chosen a number between %s and %s. Betcha can't guess it!\n",min,max);


        //Loop getting input from user until the guess matches the random number.
        do{
            guess = getIntFromUser(inputReader, "your guess");
            guessCount+=1;
            
            if (guess < randomNumber) System.out.println("Ha, nice try - too low! Try again!\n");
            else if (guess > randomNumber) System.out.println("Too bad, way too high. Try again!\n");
            else{           
                keepGuessing=false;
                if (guessCount == 1){
                    System.out.println("Wow, nice guess! That was it!");
                }else{
                    System.out.println("Finally! It's about time you got it!");
                }
                break;
            }

        }while(keepGuessing==true);

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
