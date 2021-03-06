import java.util.Scanner;
public class TheCount {
    public static void main(String[] args){
        System.out.println("*** I LOVE TO COUNT! LET ME SHARE MY COUNTING WITH YOU! ***");

        Scanner inputReader = new Scanner(System.in);

        //Take user input for a start,stop and increment range
        System.out.print("Start at : ");
        int startRange = Integer.parseInt(inputReader.nextLine());
        System.out.print("Stop at : ");
        int stopRange = Integer.parseInt(inputReader.nextLine());
        System.out.print("Count by : ");
        int incrementBy = Integer.parseInt(inputReader.nextLine()); 

        int counter = 0;

        //loop for startRange to stopRange, updated by incrementBy, where if the loop iterates every 3 times, a special line is printed.
        for (int i = startRange; i<= stopRange;i+=incrementBy){
            System.out.printf("%d ",i);
            counter+=1;
            if (counter == 3 ){
                counter = 0;
                System.out.println("- Ah ah ah!");
            }
        }
        inputReader.close();
    }

}
