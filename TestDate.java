public class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date(1, 2, 3);
        System.out.println(d1);
        System.out.println("-------------------");
        d1.setMonth(20);
        d1.setDay(12);
        d1.setYear(2006);
        System.out.println(d1);
        System.out.println(+ d1.getMonth());
        System.out.println(d1.getDay());
        System.out.println("-------------------");
        d1.setDate(10, 10, 2024);
        System.out.println(d1);
    }
}
