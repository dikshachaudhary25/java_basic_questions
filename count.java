//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
import java.util.*;
public class count{
    public static void returncount(int[] n){
        int count1=0;
        int count2=0;
        int count3=0;
        for(int i = 0;i<n.length;i++){
            if(n[i]>0){
                count1++;
            }
            else if(n[i]<0){
                count2++;
            }
            else if(n[i]==0){
                count3++;
            }
        }
        System.out.println("No. of positive values entered : "+count1);
        System.out.println("No. of negative values entered : "+count2);
        System.out.println("No. of zero values entered : "+count3);
    }
    public static void main(String[] args) {
        System.out.println("Display count of positive,negative and zeros entered");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many values you want to enter : ");
        int size = sc.nextInt();
        System.out.println("Enter the values you want to check : ");
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        returncount(arr);
    }
}