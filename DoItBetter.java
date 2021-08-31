import java.util.Scanner;
public class DoItBetter {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);
        System.out.println("How many miles can you run?");
        System.out.println("I can run" + ((Integer.parseInt(inputReader.nextLine())*2)+1));

        System.out.println("How many languages do you know?");
        System.out.println("I know " + ((Integer.parseInt(inputReader.nextLine())*2)+1)+" languages.");       

        System.out.println("How many hotdogs can you eat??");
        System.out.println("I can eat " + ((Integer.parseInt(inputReader.nextLine())*2)+1));        
        inputReader.close();
    }

}
