import java.util.*;
public class permutation{
    public static void recur(String s, String n){
        if(s.length()==0){
            System.out.println(n);
            return;
        }
        for(int i = 0; i<s.length(); i++){
            char current = s.charAt(i);
            String newString = s.substring(0,i) + s.substring(i+1);
            recur(newString, n+current);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String you want for permutation : ");
        String s = sc.next();
        recur(s, "");
    }
}