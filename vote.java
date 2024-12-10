//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.*;
public class vote{
    public static void canvote(int age){
        if(age >=18 && age<=100){
            System.out.println("Yes, the person can vote");
        }
        else{
            System.out.println("No, the person can't vote");
        }
    }
    public static void main(String[] args) {
        System.out.println("Checking voting eligibility");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of a person : ");
        int age = sc.nextInt();
        canvote(age);
    }
}