//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
public class sumodd{
    public static int oddsum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Sum of all odd number till n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int sum = oddsum(n);
        System.out.println("Sum of odd number till "+n+" = "+sum);
    }
}
