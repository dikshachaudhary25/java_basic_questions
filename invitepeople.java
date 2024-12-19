import java .util.*;
public class invitepeople{
    public static int invite(int n){
        if(n<=1){
            return 1;
        }
        
        int single = invite(n-1);
        int pair = (n-1)*invite(n-2);
        return single + pair;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of guests : ");
        int n = sc.nextInt();
        int count  = invite(n);
        System.out.println("Total ways in which guests can be invited : "+count);
    }
}