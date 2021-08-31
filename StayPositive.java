import java.util.Scanner;
public class StayPositive {


    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);

        int startVal = getIntFromUser(inputReader, "a number to count from" );
        int counter = 0;
        while (startVal>=0){
            counter +=1;
            System.out.printf("%s ",startVal);
            if (counter == 10){
                System.out.println();
                counter = 0;
            }
            startVal--;
        }
    }

/**
 * Helper method to get proper int input from scanner sc.
 * @param sc
 * @param prompt
 * @return
 */
    public static int getIntFromUser(Scanner sc, String prompt){
        int value;
        do {
            System.out.printf("Please enter %s: ",prompt);
            try {
                value = Integer.parseInt(sc.nextLine());
                if (value<1){
                    throw new NumberFormatException();
                }
                break;
 
            } catch(NumberFormatException ex) {
                System.out.println("Please input a correct value.");
            }
        }while(true);
        return value;
    }
    
}
