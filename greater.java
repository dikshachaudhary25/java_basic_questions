//Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;
public class greater{
    public static int greaternum(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args) {
        System.out.println("Printing the greater number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int number = greaternum(a,b);
        System.out.println("The greater number is : "+number);
    }
}