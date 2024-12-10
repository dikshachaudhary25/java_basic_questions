//Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
import java.util.*;
public class username{
    public static void main(String[] args) {
        System.out.println("Printing username from email id");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an email id : ");
        String email = sc.next();
        for(int i = 0; email.charAt(i)!='@'; i++){
            System.out.print(email.charAt(i));
        }
    }
}