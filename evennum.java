import java.util.*;
public class evennum{
    public static void main(String [] args){
        System.out.println("Printing all even numbers till n");
        System.out.print("Type the value of n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}