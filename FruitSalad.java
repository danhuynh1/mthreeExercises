import java.util.ArrayList;
import java.util.Arrays; 

public class FruitSalad {
    public static void main(String[] args){
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        // ArrayList<String> berries = new ArrayList<String>();
        // ArrayList<String> oranges = new ArrayList<String>();
        // ArrayList<String> apples = new ArrayList<String>();
        // ArrayList<String> otherFruitsNoTomatoes = new ArrayList<String>();

        ArrayList<String>fruitSalad = new ArrayList<String>();
        int appleCount = 0;
        int orangeCount =0;


        for (String f :fruit){
            // if (f.equalsIgnoreCase("fruit")){
            //     System.out.println(f);
            // }

            if (f.toLowerCase().contains("apple")){
                // apples.add(f);
                if (appleCount != 3){
                    fruitSalad.add(f);
                    appleCount++;
                } 
            }
            else if (f.toLowerCase().contains("orange")){
                // oranges.add(f);
                if (orangeCount != 2){
                    fruitSalad.add(f);
                    orangeCount++;
                } 

            }else{
                if (!f.toLowerCase().contains("tomato")){
                    fruitSalad.add(f);
                }
            }
            if (fruitSalad.size() == 12){
                break;
            }
        }

        


        // System.out.println("")
        System.out.println(Arrays.toString(fruitSalad.toArray()));
        // System.out.println(Arrays.toString(apples.toArray()));
        // System.out.println(Arrays.toString(oranges.toArray()));
        // System.out.println(Arrays.toString(otherFruitsNoTomatoes.toArray()));
   
    }



    
 
}
