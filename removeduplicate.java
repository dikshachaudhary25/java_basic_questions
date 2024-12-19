import java.util.*;
public class removeduplicate{
    public static boolean[] map = new boolean[26];
    public static void remove(String s,int i,String n){
        if(i == s.length()){
            System.out.println(n);
            return;
        }
        char current = s.charAt(i);
        if(map[current - 'a']== true){
            remove(s,i+1,n);
        }
        else{
            n += current;
            map[current - 'a'] = true;
            remove(s, i+1, n);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.next();
        
        remove(s,0, "");

    }
}