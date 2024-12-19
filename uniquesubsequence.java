import java.util.*;
public class uniquesubsequence{
    public static void sub(String s, int i, String n, HashSet<String> set){
        if(i == s.length()){
            if(set.contains(n)){
                return;
            }
            else{
                System.out.println(n);
                set.add(n);
                return;
            }
        }
        char current = s.charAt(i);
        sub(s, i+1, n+current, set);
        sub(s, i+1, n, set);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.next();
        HashSet<String> set = new HashSet<>();
        sub(s,0, "", set);

    }
}