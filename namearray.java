//Take an array of names as input from the user and print them on the screen.
import java.util.*;
public class namearray{
    public static void main(String[] args) {
        System.out.println("Creating an array of names");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many names you want to enter : ");
        int size = sc.nextInt();
        String[] arr = new String[size];
        for(int i = 0; i<size; i++){
            System.out.print("Input name "+(i+1)+" : ");
            arr[i]= sc.next();
        }
        System.out.println("Displaying names in the array - ");
        for(int i = 0; i<size; i++){
            System.out.println(arr[i]);
        }
    }
}