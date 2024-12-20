import java.util.*;
public class mergesort{
    public static void divide(int[] arr, int a, int b){
        if(a>=b){
            return;
        }
        int mid = a + (b-a)/2;
        divide(arr, a, mid);
        divide(arr, mid+1, b);
        conquer(arr, a,mid,b);
    }
    public static void conquer(int[] arr, int a, int mid, int b){
        int[] sorted = new int[b-a+1];
        int i= a;
        int j= mid +1;
        int x =0;
        while(i<=mid && j<=b){
            if(arr[i]<=arr[j]){
                sorted[x++] = arr[i++]; 
            }
            else{
                sorted[x++] = arr[j++];
            }
        }
        while(i<=mid){
            sorted[x++] = arr[i++]; 
        }
        while(j<=b){
            sorted[x++] = arr[j++]; 
        }
        for(int k =0 , l = a; k<sorted.length; k++,l++ ){
            arr[l] = sorted[k];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        divide(arr, 0, size-1);
        for(int i = 0; i<size; i++){
            System.out.print(arr[i]+ " ");
        }
        System.err.println();
    }
}