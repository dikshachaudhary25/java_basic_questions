//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
import java.util.*;
public class lengthofstring{
    public static void main(String[] args) {
        System.out.println("Finding length of concatenated strings");
        System.out.print("Input the size of the string array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] str = new String[size];
        for(int i =0; i<size ; i++){
            System.out.print("Input string "+(i+1)+" : ");
            str[i] = sc.next();
        }
        int count = 0;
        for(int i = 0; i<size; i++){
            count += str[i].length();
        }
        System.out.println("Length of all the strings = "+count);
    }
}