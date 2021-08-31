import java.util.Scanner;
public class FieldDay {
    public static void main(String[] args){
        // int compareVal = 0;
        Scanner inputReader = new Scanner(System.in);

        System.out.print("What's your last name? ");
        String name = inputReader.nextLine();

        System.out.printf("Aha You're on team \"%s\"!\n",getTeamFromName(name));
        System.out.println("Good luck in the games!");

        inputReader.close();

    }

    public static String getTeamFromName(String name){
        String team = "";
        if (name.compareTo("Baggins") <= 0){
            team = "Red Dragons";
        }else if (name.compareTo("Baggins")>0 && name.compareTo("Dresdin")<=0){
             team = "Dark Wizards";
        }else if (name.compareTo("Dresdin")>0 && name.compareTo("Howl")<=0){
            team = "Moving Castles";
        }else if (name.compareTo("Howl")>0 && name.compareTo("Potter")<=0){
            team = "Golden Snitches";
        }else if (name.compareTo("Potter")>0 && name.compareTo("Vimes")<=0){
            team = "Night Guards";
        }else if (name.compareTo("Vimes")>0){
            team = "Black Holes";
        }
        return team;
    }

}
