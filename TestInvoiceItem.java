public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem in1 = new InvoiceItem("D1", "Doll", 123, 30000);
        System.out.println(in1);
        System.out.println("---------------");
        in1.setQty(1000);
        in1.setUnitPrice(25000);
        System.out.println(in1);
        System.out.println(in1.getId());
        System.out.println(in1.getDesc());
        System.out.println(in1.getQty());
        System.out.println(in1.getUnitPrice());
        System.out.println(in1.getTotal());
    }
}