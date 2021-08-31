import java.util.Random;
public class LazyTeenager {

    public static void main(String[] args){
        //Initialize variables
        int count = 1;
        int max = 100;
        int min = 10;
        int cleanPossibility = 10;
        int cleanChance;
        boolean isClean = false;

        do{
            //Tell teen to clean their room and a chance of if they will clean it.
            System.out.printf("Clean your room!! (x%d)\n",count);

            //Amount of times teen has been told to clean their room.
            count+=1;
            // Decision of the teen to clean their room
            cleanChance = new Random().nextInt(max - min + 1) + min;


            //Edge case where if a teen has been told 7 times to clean, the loop will end, but the teen is grounded
            if (count==7){
                System.out.printf("Clean your room!! (x%d)\n",count);
                System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;

            //If val > chance, they haven't decided to clean their room yet, so the chance to clean it will increase by 1 (10%).
            }else if (cleanChance > cleanPossibility){
                cleanPossibility+=10;
            
            //They have cleaned the room.
            }else{ //Random Number cleanChance <= cleanPossibility
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
                isClean = true;
                break;
            }
 

        }while(isClean == false);
    }

}
