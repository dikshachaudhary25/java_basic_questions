import java.util.*;
public class reversestringrecur{
    public static void printString(String s, int i){
        if(i == 0){
            System.out.print(s.charAt(i));
            
            return;
        }
        System.out.print(s.charAt(i));
        printString(s, i-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.next();
        int i = s.length()-1;
        printString(s, i);
    }
}