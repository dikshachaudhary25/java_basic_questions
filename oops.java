import java.util.*;
class pen{
    String colour;
    String type;

    public void write(){
        System.out.println("Write something");
    }
    public void toPrint(){
        System.out.println(this.colour);
    }
}
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
    
    
}
public class oops{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        Student s1 = new Student(name,age);
        Student s2 = new Student(s1);
        s2.printInfo();
    }
} 