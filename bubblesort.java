import java.util.*;

public class bubblesort{
    public static void sort1(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j= 0; j<arr.length-i-1; j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Performing bubble sort");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the  array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements : ");
        for(int i =0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        sort1(arr);
        
    }
    
}
