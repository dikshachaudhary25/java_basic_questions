//Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.
import java.util.*;
public class indices{
    public static void main(String[] args) {
        System.out.println("Printing indices of an element in 2D array");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter elements in matrix format - ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.print("Enter a number you want to search in the array : ");
        int number = sc.nextInt();
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols;j++){
                if(arr[i][j]==number){
                    System.out.print("Element present at indices : "+i+j);
                    System.out.println();
                }
            }
        }
    }
}