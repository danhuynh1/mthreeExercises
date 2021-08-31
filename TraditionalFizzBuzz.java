import java.util.Scanner;

public class TraditionalFizzBuzz{
    public static void main(String[] args){
        /**A program that determines if an integer i is divisible by 3,5 or both(15), and outputs a "fizz",buzz or both accordingly.  */
        Scanner inputReader = new Scanner(System.in);
        System.out.print("How many units of fizzing and buzzing do you need in your life?: ");
        int num = Integer.parseInt(inputReader.nextLine());
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) System.out.println("fizzbuzz");
            else if ((i % 3) == 0) System.out.println("fizz");
            else if ((i % 5) == 0) System.out.println("buzz");
            else System.out.println(i);
        }
        inputReader.close();

    System.out.println("TRADITION!!!!!");
    }

}