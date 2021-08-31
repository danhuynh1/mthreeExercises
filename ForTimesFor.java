import java.util.Scanner;
public class ForTimesFor{
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Which times table shall I recite? ");
        int tableMultiple = Integer.parseInt(inputReader.nextLine());
        int correctAnswers = 0;
        for (int i = 1; i<= 15;i++){
            //System.out.println(i);
            System.out.printf("%s * %s is: ",i,tableMultiple);
            int userAnswer = Integer.parseInt(inputReader.nextLine());

            if (userAnswer == i*tableMultiple){
                correctAnswers+=1;
                System.out.println("Correct!");
            }else{
                System.out.println("Sprry,no the answer is: "+ (i*tableMultiple));
            }

        }
        System.out.printf("You got %s correct.\n",correctAnswers);   
        inputReader.close();
    }
}