package Level1;

public class Circle {

    double radius;

    Circle(){
        this(3.55);
        System.out.println("Default Constructor");
    }

    Circle(double radius){
        this.radius = radius;
    }


    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.radius);

        Circle c2 = new Circle(3.1);
        System.out.println(c2.radius);
    }
}
