class Shape{
    String colour;
    public void area(){
        System.out.println("Display area ");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }

}

class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r) ;
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }

}

public class oops3{
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(4, 3);
    }
}