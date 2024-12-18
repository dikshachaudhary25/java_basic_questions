import java.util.*;
public class towerofhanoi{
    public static void hanoi(int a, String s, String h, String d){
        if(a == 1) {
            System.out.println("transfer disk " + a + " from " + s + " to " + d);
            return;
        }
        hanoi(a-1, s, d, h);
        System.out.println("transfer disk " + a + " from " + s + " to " + h);
        hanoi(a-1, h, s, d);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many disks you want to use : ");
        int a = sc.nextInt();
        hanoi(a, "s", "h", "d");
    }
}