public class Circle {
    private double radius;

    //Sätter radien till 1
    public Circle() {
        radius =1.0;
    }
    public Circle(double r) {
        r = radius;
    }
    //Räknar ut radien
    public double getRadius () {
        return radius;
    }
    public void setRadius (double newRadius) {
        radius=newRadius;
    }
   //Räknar ut arean av cirkeln
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public double getCircumference () {
        return 2*Math.PI*this.radius;
    }
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
    public static void main(String[] args){

        Circle c = new Circle();
        System.out.println();
        }

    }
