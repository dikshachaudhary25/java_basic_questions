import java.util.*;
public class calculator{
    public static void main(String [] args){
        System.out.println("A simple calculator");
        System.out.print("Enter first value : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter second value : ");
        int b = sc.nextInt();
        System.out.print("Enter the mathematical operator : ");
        String op = sc.next();
        int output;
        switch (op){
            case "+": 
            output = a+b;
            System.out.print("Sum is : ");
            System.out.print(output);
            break;
            case "-":
            System.out.print("Do you want positive or negative value : ");
            String option = sc.next();
            switch(option){
                case "positive":
                if(a>b){
                    output = a-b;
                    System.out.print("Difference is : ");
                    System.out.print(output);
                }
                else{
                    output = b-a;
                    System.out.print("Difference is : ");
                    System.out.print(output);
                }
                break;
                case "negative":
                output = a-b;
                System.out.print("Difference is : ");
                System.out.print(output);
                break;
            }
            break;
            case "*":
            output = a*b;
            System.out.print("Product is : ");
            System.out.print(output);
            break;
            case "/":
            output = a/b;
            System.out.print("Quotient is : ");
            System.out.print(output);
            break;
        }
    }
}