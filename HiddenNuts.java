import java.util.Random;

public class HiddenNuts {

    public static void main(String[] args) {

        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");

        int spotCount = 0;
        for (String spot: hidingSpots){
            if ("Nut".equals(spot)){
                System.out.printf("Found it! It's in spot# %d\n",spotCount);
                break;
            }
            spotCount++;
        }

        System.out.println(java.util.Arrays.asList(hidingSpots).indexOf("Nut"));

    }

}
