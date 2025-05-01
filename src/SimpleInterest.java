package src;
import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Principal amount : ");
        double principal = sc.nextDouble();

        System.out.println("Enter the Time period in years : ");
        double time = sc.nextDouble();

        System.out.println("Enter the Rate of Interest : ");;
        double interest = sc.nextDouble();

        sc.close();

        double ptr = (principal * time * interest) / 100;

        System.out.println(ptr);

    }
}
