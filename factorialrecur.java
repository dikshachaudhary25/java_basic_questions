import java.util.*;
public class factorialrecur{
    public static void factorial(int a,int prod){
        
        if(a>0){
            prod*=a;
            a--;
            factorial(a,prod);
            return;
        }
        System.out.println("The factorial is : "+prod);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        int prod =1;
        factorial(a,prod);
    }
}