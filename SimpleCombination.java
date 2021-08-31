import java.util.Arrays;

public class SimpleCombination {
    public static void main(String[] args) {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49}; // 12 numbers
        int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100}; // also 12!

        int[] wholeNumbers = new int[24];


        for (int i = 0; i<(firstHalf.length+ secondHalf.length);i++){
            if (i < firstHalf.length){
                wholeNumbers[i] = firstHalf[i];
            }else{
                wholeNumbers[i] = secondHalf[i-firstHalf.length];
            }
        }
        
        // System.arraycopy(firstHalf, 0, wholeNumbers, 0, firstHalf.length);
        // System.arraycopy(secondHalf, 0, wholeNumbers, firstHalf.length, secondHalf.length);



        // Combining code should go here!
        System.out.println("All together now!:");
        // Printing code should go here
        for (int i: wholeNumbers){
            System.out.print(i + " ");
        }
    }
}
