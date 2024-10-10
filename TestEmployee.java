public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Wang", "Thahh", 3000);
        System.out.println(e1);
        System.out.println("--------------");
        e1.setSalary(5000);
        System.out.println(e1);
        System.out.println(e1.getId());
        System.out.println(e1.getFirstName());
        System.out.println(e1.getLastName());
        System.out.println(e1.getSalary());
        System.out.println(e1.getName());
        System.out.println(e1.getAnnualSalary());
        System.out.println("--------------");
        System.out.println(e1.raiseSalary(50));
        System.out.println(e1);
    }
}