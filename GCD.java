
import java.util.Scanner;

public class GCD {
    
    public static int gcd(int a, int b){   
        
        if (b==0){
            return a;
        }
        else
            return gcd (b, a % b);
    }
    
    public static void main (String[] args){
        
        Scanner compute = new Scanner (System.in);
        
        System.out.print("Enter the first number: ");
        int a = compute.nextInt();
        
        System.out.print("Enter the second number: ");
        int b = compute.nextInt();
        
        System.out.println("The Greatest Common Divisor of " + a + " and " + b + " is " + gcd (b, a%b));
    }
}
