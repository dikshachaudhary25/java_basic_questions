//Take an array of numbers as input and check if it is an array sorted in ascending order.
import java.util.*;
public class orderofarray{
    public static void main(String[] args) {
        System.out.println("Finding out if array is ascending or not");
        System.out.print("Input the size of the array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Input element "+(i+1)+" : ");
            arr[i]= sc.nextInt();
        }
        int flag = 0;
        for(int i = 0; i<size-1; i++ ){
            if(arr[i]<arr[i+1]){
                flag = 1;
            }
            else{
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.println("The array is in ascending order");
        }
        else if(flag == 0){
            System.out.println("The array is not in ascending order");
        }
    }
}