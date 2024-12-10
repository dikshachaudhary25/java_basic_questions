//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
import java.util.*;
public class power{
    public static int exponent(int x, int n){
        int power=1; 
        for(int i=1;i<=n;i++){
            power*=x;
        }
        return power;
    }
    public static void main(String[] args) {
        System.out.println("Printing power of a number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base value : ");
        int x = sc.nextInt();
        System.out.print("Enter the exponent value of : ");
        int n = sc.nextInt();
        int power = exponent(x, n);
        System.out.println(n+"3 power of "+x+" = "+power);
    }
}