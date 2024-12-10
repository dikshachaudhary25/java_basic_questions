//Find the maximum & minimum number in an array of integers. 
import java.util.*;
public class maxminarray{
    public static void main(String[] args) {
        System.out.println("Let's find max and min number in the array");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many elements in array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Input element "+(i+1)+" : ");
            arr[i]= sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for(int i=0; i< size; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The minimum value in the array = "+min);
        for(int i=0; i< size; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The maximum value in the array = "+max);
    }
}