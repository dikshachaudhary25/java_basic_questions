//Move a character occuring anywhere to the end of the string
import java.util.*;
public class movechar{
    public static void recur( StringBuilder sb, char c, int i ){
        char current = sb.charAt(i);
        if(i == sb.length()-1){
            System.out.println(sb);
            return;
        }
        if(current == c){
            sb.insert(sb.length(), c);
            sb.delete(i,i+1);
        }
        recur(sb, c, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.next();
        System.out.print("Enter character you want to move at the end : ");
        char c = sc.next().charAt(0);
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        recur(sb,c,0);

    }
}