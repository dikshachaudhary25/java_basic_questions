//Write a program to print Fibonacci series of n terms where n is input by user
import java.util.*;
public class fibonacci{
    public static void fibo(int n){
        if(n==0){
            System.out.println("0");
        }
        else if(n==1){
            System.out.println("0 1 ");
        }
        int fibonacci=0;
        int first = 1;
        int second = 1;
        if(n>1){
            System.out.print("011");
            for(int i=4;i<=n;i++){
                fibonacci=first+second;
                System.out.print(fibonacci);
                first=second;
                second=fibonacci;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Fibonacci series");
        System.out.print("Enter the length of the series : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("The fibonacci series : ");
        fibo(n);
    }
}