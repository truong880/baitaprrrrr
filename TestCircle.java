public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2);
        System.out.println(c1);
        Circle c2 = new Circle();
        System.out.println(c2);
        System.out.println("----------");
        c1.setRadius(4);
        System.out.println(c1);
        System.out.println("----------");
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
    }
}