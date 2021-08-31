import java.util.Scanner;

public class BirthStones {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);
        
        int birthMonth = 1;

        do {
            System.out.print("Please enter a month: ");
            try {
                birthMonth = Integer.parseInt(inputReader.nextLine());
                if (birthMonth<1 || birthMonth>12){
                    throw new NumberFormatException();
                }
                break;
 
            } catch(NumberFormatException ex) {
                System.out.println("Please input a correct value.");
            }
        }while(true);

        String[] monthBirthStone = getMonthBirthstone(birthMonth);

        System.out.printf("%s's birthstone is %s.",monthBirthStone[0],monthBirthStone[1]);
        inputReader.close();
    }

    /**
     * Helper method to get strings of a month and birthStone based on a numeric month.
     * @param birthMonth
     * @return String array where array[0] is month Name, array[1] is month Birth Stone.
     */
    public static String[] getMonthBirthstone(int birthMonth){
        String[] names = new String[2];
        String month = "";
        String birthStone = "";
        switch (birthMonth){
            case 1:
                month = "January";
                birthStone = "Garnet";
            break;
            case 2:
                month = "February";
                birthStone = "Amethyst";
                break;
            case 3:
                month = "March";
                birthStone = "Aquamarine";
                break;
            case 4:
                month = "April";
                birthStone = "Diamond";
                break;
            case 5:
                month = "May";
                birthStone = "Emerald";
                break;
            case 6:
                month = "June";
                birthStone = "Pearl";
                break;
            case 7:
                month = "July";
                birthStone = "Ruby";
                break;
            case 8:
                month = "August";
                birthStone = "Peridot";
                break;
            case 9:
                month = "September";
                birthStone = "Sapphire";
                break;
            case 10:
                month = "October";
                birthStone = "Opal";
                break;
            case 11:
                month = "November";
                birthStone = "Topaz";
                break;
            case 12:
                month = "December";
                birthStone = "Turqoise";
                break;
        }

        names[0] = month;
        names[1] = birthStone;
        return names;
    }

}
