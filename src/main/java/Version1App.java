import java.time.LocalDate;


public class Version1App {

    public static void main(String[] args) {
        // Create Supplier objects
        Supplier s1 = new Supplier("Supplier 1", "Address 1", 1000.0, 5000.0); // Use double for amountOwed
        Supplier s2 = new Supplier("Supplier 2", "Address 2", 2000.0, 6000.0);
        Supplier s3 = new Supplier("Supplier 3", "Address 3", 3000.0, 7000.0);

        // Create Item objects
        Item i1 = new Item("Item 1", "ID1", 100, 50, 100, 10.0, s1, false); // Use double for unitCostPrice
        Item i2 = new Item("Item 2", "ID2", 200, 100, 200, 20.0, s2, false);
        Item i3 = new Item("Item 3", "ID3", 300, 150, 300, 30.0, s3, false);
        Item i4 = new Item("Item 4", "ID4", 400, 200, 400, 40.0, s1, false);
        Item i5 = new Item("Item 5", "ID5", 500, 250, 500, 50.0, s2, false);

        // Create Delivery objects
        Delivery d1 = new Delivery(i1, LocalDate.now(), 50);
        Delivery d2 = new Delivery(i2, LocalDate.now(), 100);
        Delivery d3 = new Delivery(i3, LocalDate.now(), 150);

        // Update stock and amount owed after deliveries
        i1.increaseQuantityInStock(d1.quantity());
        s1.increaseOwed(d1.calculateDeliveryCost());

        // Update for other deliveries (assuming similar logic)
        i2.increaseQuantityInStock(d2.quantity());
        s2.increaseOwed(d2.calculateDeliveryCost());
        i3.increaseQuantityInStock(d3.quantity());
        s3.increaseOwed(d3.calculateDeliveryCost());

        // Display delivery cost
        System.out.println("Cost of delivery d1: " + d1.calculateDeliveryCost());

        // Display amount owed and quantity in stock before and after delivery for s1 and i1
        System.out.println("Amount owed to s1 before delivery: " + s1.getAmountOwed());
        System.out.println("Quantity of i1 in stock before delivery: " + i1.quantityInStock());

        System.out.println("Amount owed to s1 after delivery: " + s1.getAmountOwed());
        System.out.println("Quantity of i1 in stock after delivery: " + i1.quantityInStock());
    }
}