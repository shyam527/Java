import java.util.*;

public class Palindrome {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("String : ");
        String str = sc.next();
        String reverse = "";
        int strLength = str.length();

        for(int i = strLength - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        
        if(str.equals(reverse)){
            System.out.println("Given String is a Palindrome : " + reverse);
        }
        else    
            System.out.println("Given String is not Palindrome : " + reverse);

        sc.close();

    }
}
