import java.time.LocalDate;

public class Delivery {
    private final Item item;
    private final int quantity;

    public Delivery(Item item, LocalDate date, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public double calculateDeliveryCost() {
        return quantity * item.getUnitCostPrice();
    }

    public int quantity() {
        return quantity;
    }
}