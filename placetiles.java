import java.util.*;
public class placetiles{
    public static int tiles(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int verticle = tiles(n-m,m);
        int horizontal = tiles(n-1, m);
        return verticle + horizontal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the floor matrix : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count  = tiles(n,m);
        System.out.println("Total ways in which tiles can be arranged : "+count);
    }
}