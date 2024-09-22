import java.util.*;

public class gcd {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = 0;
        for (int i = 0; i <= Math.min(num1, num2); i++){
            if ((num1 % i == 0) && (num2 % i == 0))
                gcd = i;
            
        }
        System.out.println("Gcd is "+gcd);
    }
}