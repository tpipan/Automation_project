package course03_04;

public class Main {
    public static  void main(String[] args) {
        // null object. Throws NullPointerException
//        Circle circle = null;
//        System.out.println(circle.radius);
        //new object
        Circle circle = new Circle();
        circle.setRadius(2.0);
        System.out.println(circle.radius);
//        System.out.println(circle.getArea());
        circle.setRadius(5.0);
        System.out.println(circle.radius);
        System.out.println(circle.getArea());
    }
}
