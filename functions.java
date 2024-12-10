import java.util.*;
public class functions{
    public static int printSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static int printProduct(int a, int b){
        int product = a*b;
        return product;
    }
    public static int printFactorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static int printPrime(int a){
        int flag = 0;
        if(a==0 || a==1){
            System.out.println("Number is not prime");
            flag = 1;

        }
        for(int i = 2; i<a;i++){
            if(a%i==0){
            System.out.println("Number is not prime");
            flag = 1;
            break;
            }
        }
        if(flag == 0){
            System.out.println("Number is prime");
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("Let's print functions");
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's take some inputs");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prime = printPrime(a);
        System.out.println(prime);
    }
}