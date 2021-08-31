import java.util.Scanner;

public class BestAdderEver {
    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.print("Enter B: ");
        b = Integer.parseInt(sc.nextLine());
        System.out.print("Enter C: ");
        c = Integer.parseInt(sc.nextLine());
    
        System.out.printf("%s + %s + %s = %s",a,b,c,a+b+c);
        sc.close();
    }

}
