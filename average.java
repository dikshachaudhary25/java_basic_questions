//Enter 3 numbers from the user & make a function to print their average.
import java.util.*;
public class average{
    public static int printavg(int a, int b, int c){
        int avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        System.out.println("Average of 3 numbers");
        System.out.print("Input first number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Input second number : ");
        int b = sc.nextInt();
        System.out.print("Input third number : ");
        int c = sc.nextInt();
        int average = printavg(a,b,c);
        System.out.println("The average of "+a+" "+b+" "+c+" = "+average);
    }
}
