import java.util.*;
public class backtracking{
    public static void sequence(String s, int i, String n){
        if(i==s.length()){
            System.out.println(n);
            return;
        }
        char c = s.charAt(i);
        sequence(s,i+1,n+c);
        sequence(s,i+1,c+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.next();
        sequence(s,0,"");
    }
}