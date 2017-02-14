
import java.util.Scanner;

public class LCM {
    public static int gcd(int a, int b){   
        
        if (b==0){
            return a;
        }
        else
            return gcd (b, a % b);
    }
    public static int lcm(int a, int b){
        
        return (a * b) / gcd(a, b);
    }
    
    public static void main (String[] args){
        
        Scanner compute = new Scanner (System.in);
        
        System.out.print("Enter the first number: ");
        int nb1 = compute.nextInt();
        
        System.out.print("Enter the second number: ");
        int nb2 = compute.nextInt();
        
        System.out.println("The Least Common Multiple of " + nb1 + " and " + nb2 + " is " + lcm (nb1, nb2));
    }
}
