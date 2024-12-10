//Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;
public class circumference{
    public static double circum(int r){
        double circumference= 2*3.14*r;
        return circumference;
    }
    public static void main(String[] args) {
        System.out.println("Circumference of a circle");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of r : ");
        int r = sc.nextInt();
        double circumference1 = circum(r);
        System.out.println("The circumference of radius "+r+" = "+circumference1);
    }
}
