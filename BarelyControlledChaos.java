import java.util.Random;

public class BarelyControlledChaos {

    public static void main(String[] args) {

        String color = getRandomColor(); // call color method here
        String animal = getRandomAnimal(); // call animal method again here
        String colorAgain = getRandomColor(); // call color method again here
        int weight = getRandomIntFromRange(5,200); // call number method,
            // with a range between 5 - 200
        int distance = getRandomIntFromRange(10,20); // call number method,
            // with a range between 10 - 20
        int number = getRandomIntFromRange(10000,20000); // call number method,
            // with a range between 10000 - 20000
        int time = getRandomIntFromRange(2,6); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }

    public static String getRandomColor(){
        String[] colors = {"Red","Blue","Green","Orange","Purple"};
        int randomColorIndex = new Random().nextInt(colors.length);

        return colors[randomColorIndex];

    }

    public static String getRandomAnimal(){
        String[] animals = {"Dog","Cat","Cow","Monkey","Rhino"};
        int randomAnimalIndex = new Random().nextInt(animals.length);
        return animals[randomAnimalIndex];

    }
    public static int getRandomIntFromRange(int min, int max){
        return new Random().nextInt(max - min + 1) + min;
    }

    // ??? Method 1 ???
    // ??? Method 2 ???
    // ??? Method 3 ???
}