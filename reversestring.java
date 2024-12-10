//Reverse a string
import java.util.*;
public class reversestring{
    public static void main(String[] args) {
        System.out.println("Reverse a string");
        System.out.print("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        StringBuilder str = new StringBuilder();
        str.append(str1);
        for (int i = 0; i<(str.length()/2);i++){
            int front = i;
            int back = str.length()-1-i;
            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);
            str.setCharAt(front, backChar);
            str.setCharAt(back, frontChar);
        }
        System.out.println(str);
    }
}

