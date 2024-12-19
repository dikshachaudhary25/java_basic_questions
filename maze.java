import java.util.*;
public class maze{
    public static int paths(int i, int j, int n, int m){
        if(i == n||j==m){
            return 0;
        }
        if(i== n-1 && j==m-1){
            return 1;
        }
        int down= paths(i+1,j,n,m);
        int right = paths(i,j+1,n,m);
        return down + right;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix : ");
        int n= sc.nextInt();
        int m = sc.nextInt();
        int count = paths(0, 0, n, m);
        System.out.println("Total number of paths : "+count);
    }
}