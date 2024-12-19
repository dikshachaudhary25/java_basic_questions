import java.util.*;
public class keypadcombination{
    public static String[] keypad = {".","abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx","yz" };
    public static void printkey(String s, int a, String n ){
        if(a == s.length() ){
            System.out.println(n);
            return;
        }
        char current = s.charAt(a);
        String map = keypad[current - '0' ];
        for(int i = 0; i<map.length();i++){
            printkey(s,a+1,n+map.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the combination you want : ");
        String s = sc.next();
        printkey(s, 0, "");
    }
}