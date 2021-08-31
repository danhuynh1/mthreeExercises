public class FruitsBasket {
    public static void main(String[] args) {
        String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
            "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
            "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
            "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
            "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
            "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
            "Dragonfruit", "Apple", "Orange", "Orange"};

        int numOranges = 0;
        int numApples = 0;
        int numOtherFruit = 0;

        // System.out.println(fruitBasket.length);
        
        // Fruit counting code goes here!
        for (String fruit : fruitBasket){
            if (fruit.equals("Apple"))numApples++;
            else if (fruit.equals("Orange"))numOranges++;
            else numOtherFruit++;
        }

        System.out.printf("Total# of Fruit in Basket: %d\nNumber of Apples: %d\nNumber of Oranges: %d\nNumber of Other Fruit: %d\n",fruitBasket.length,numApples,numOranges,numOtherFruit);
        // Print The Results!

    }
}
