

public class Circle {
    private double radius;
    
    // non-parematrized constructor
    Circle(){
        this(1.0); // constructor channing
    }
    // parematrized constructor
    Circle(Double rad){
        this.radius = rad;
    }

   

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.radius);

        Circle c2 = new Circle(4.5);
        System.out.println(c2.radius);
    }
    
}
