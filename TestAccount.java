public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account("B1", "Th Wang", 100);
        System.out.println(a1);
        Account a2 = new Account("B2", "Wang");
        System.out.println(a2);
        System.out.println("---------------");
        System.out.println(a1.getId());
        System.out.println(a1.getName());
        System.out.println(a1.getBalance());
        System.out.println("---------------");
        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(200);
        System.out.println(a1);
        System.out.println("---------------");
        a1.transferTo(a2, 30);
        System.out.println(a1);
        System.out.println(a2);
    }
}