public class TestRectangle{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(4, 3);
        System.out.println(r1);
        Rectangle r2 = new Rectangle();
        System.out.println(r2);
        System.out.println("--------------");
        r1.setLength(8);
        r1.setWidth(5);
        System.out.println(r1);
        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());
        System.out.println("--------------");
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}