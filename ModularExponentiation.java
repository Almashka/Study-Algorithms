import java.util.Scanner;
// Finding modular exponentiation of a number
class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner (System.in);
                
            System.out.print("Type any number for value: ");
            int value = scan.nextInt();
                
            System.out.print("Type any number for power: ");
            int power = scan.nextInt();
                
            System.out.print("Type any number for mod: ");
            int mod = scan.nextInt();
                
            System.out.print("Answer is ");
            System.out.println(modExp(value, power, mod));
    }
    private static int modExp(int value, int power, int mod) {
        if (power == 0) {
            return 1;
        }
	if (power % 2 == 0) {
	    return ((modExp(value * value, power / 2, mod) ) % mod);    //when power is an even number
        }
            return (value * (modExp(value * value, (power - 1) / 2, mod) ) % mod);  //when power is an odd number
    }
}
