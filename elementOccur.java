//Take an array as input from the user. Search for a given number x and print the index at which it occurs.
import java.util.*;
public class elementOccur{
    public static void main(String[] args) {
        System.out.print("Input the size of the array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Input element "+(i+1)+" : ");
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter a number you want to search in the array : ");
        int number = sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]==number){
                System.out.print("Element present at index : "+i);
                System.out.println();
            }
        }
    }
}