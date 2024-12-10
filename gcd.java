//Write a function that calculates the Greatest Common Divisor of 2 numbers. 
import java.util.*;
public class gcd{
    public static int lcf(int a, int b) {
        int[] a1 = new int[100];
        int[] b1 = new int[100];
        int indexA = 0, indexB = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                a1[indexA] = i;
                indexA++;
            }
        }
        for (int i = 1; i <= b; i++) {
            if (b % i == 0) {
                b1[indexB] = i;
                indexB++;
            }
        }
        int max = 0;
        for (int i = 0; i < indexA; i++) {
            for (int j = 0; j < indexB; j++) {
                if (a1[i] == b1[j] && a1[i] > max) {
                    max = a1[i];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter values first value : ");
        int a = sc.nextInt();
        System.out.print("enter values second value : ");
        int b = sc.nextInt();
        int gcd = lcf(a,b);
        System.err.println("The gcd = "+gcd);
    }
}