import java.util.*;
public class table{
    public static void main(String[] args) {
        System.out.println("Table of any number");
        System.out.print("Enter the number you want table of : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The table of "+n);
        for(int i=1; i<=10;i++){
            int table;
            table=n*i;
            System.out.println(table);
        }
    }
}