import java.util.*;
class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }
     
}
public class oops2{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        s1.name = sc.next();
        System.out.print("Enter age: ");
        s1.age = sc.nextInt();
        s1.printInfo(s1.name);
        
    }
} 