//Find the 1st & last occurance of an element in string
import java.util.*;
public class occurrecur{
    public static int first = -1;
    public static int last = -1;
    public static void recur(String s, int i, char c){
        if(i == s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current = s.charAt(i);
        if(current == c){
            if(first == -1){
                first = i;
            }
            else{
                last = i;
            }
        }
        recur(s,i+1,c);
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with multiple repeated letters : ");
        String s = sc.next();
        System.out.print("Enter the character you want to search : ");
        char c = sc.next().charAt(0);
        recur(s,0,c);
    }
}