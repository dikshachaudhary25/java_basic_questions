import java.util.*;
public class primenumber{
    public static void main(String[] args) {
        System.out.println("Let's find if a number is prime");
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag=0;
        if(n == 0 || n==1){
            System.out.println("The number is not prime");
            flag = 1;
        }
        for(int i = 2; i<n/2; i++){ // n/2 runs till half of the previous number 
            if(n%i==0){
                System.out.println("The number is not prime");
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("The number is prime");
        }
    }
}