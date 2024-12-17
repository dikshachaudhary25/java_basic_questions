import java.util.*;
public class insertionsort{
    public static void sort1(int[] arr){
        for(int i =1; i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && key < arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("Performing insertion sort");
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