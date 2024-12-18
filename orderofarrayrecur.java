import java.util.*;
public class orderofarrayrecur{
    public static boolean recur(int[] arr,int i){
        if (i==arr.length-1){
            return true;
        }
        if(arr[i] < arr[i+1]){
            return recur(arr, i+1);
        }
        else{
            return false;
        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(recur(arr,0));
    }
}