import java.util.Scanner;
public class WindowMaster{
    // final static float GLASSCOST = 3.50f;
    // final static float TRIMCOST = 2.25f;
    /**
     * A window cost calculator, where Cost = glass cost (from area) + trim cost  (from perimeter)
     */
    public static void main(String[] args){

        float height, width, areaOfWindow, perimeterOfWindow,cost;
        float GLASSCOST, TRIMCOST;
        int numberOfWindows;



        Scanner sc = new Scanner(System.in);

        // get input for values for calculations.
        GLASSCOST = getFloatFromUser(sc, "Glass cost");
        TRIMCOST = getFloatFromUser(sc, "Trim Cost");
        height = getFloatFromUser(sc, "Height");
        width = getFloatFromUser(sc, "Width");
        numberOfWindows = getIntFromUser(sc, "Windows");

        sc.close();

        // calculate the area of the window
        areaOfWindow = height * width;

        // calculate the perimeter of the window
        perimeterOfWindow = 2 * (height + width);

        cost = ((GLASSCOST * areaOfWindow) + (TRIMCOST * perimeterOfWindow)) * numberOfWindows;

        System.out.printf("Total Cost for %s windows = $%.2f. \n",numberOfWindows,cost);

    }
/**
 * Helper Method to get proper positive Float from scanner 
 * @param sc
 * @param prompt
 * @return
 */

    public static float getFloatFromUser(Scanner sc, String prompt){
        float value;
        do {
            System.out.printf("Please enter %s: ",prompt);
            try {
                value = Float.parseFloat(sc.nextLine());
                if (value<0){
                    throw new NumberFormatException();
                }
                break;
 
            } catch(NumberFormatException ex) {
                System.out.println("Please input a correct value.");
            }
        }while(true);

        return value;
    }
/**
 * Helper Method to get proper positive int from scanner 
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
                if (value<0){
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