import java.util.*;
public class subsequence{
    public static void sub(String s, int i, String n){
        if(i == s.length()){
            System.out.println(n);
            return;
        }
        char current = s.charAt(i);
        sub(s, i+1, n+current);
        sub(s, i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.next();
        
        sub(s,0, "");

    }
}