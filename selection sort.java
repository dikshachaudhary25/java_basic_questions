import java.util.*;

public class selectionsort{
    public static void sort1(int[] arr){
        
        for(int i=0; i<arr.length-1; i++){       
            int smallest = i;     
            for(int j= i+1; j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("Performing selection sort");
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
