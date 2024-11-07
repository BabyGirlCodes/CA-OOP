public class Item {
    private String itemName;
    private String uniqueId;
    private int quantityInStock;
    private int reorderLevel;
    private int reorderQuantity;
    private double unitCostPrice;
    private Supplier supplier;
    private boolean onOrder;

    public Item(String itemName, String uniqueId, int quantityInStock, int reorderLevel, int reorderQuantity, double unitCostPrice, Supplier supplier, boolean onOrder) {
        this.itemName = itemName;
        this.uniqueId = uniqueId;
        this.quantityInStock = quantityInStock;
        this.reorderLevel = reorderLevel;
        this.reorderQuantity = reorderQuantity;
        this.unitCostPrice = unitCostPrice;
        this.supplier = supplier;
        this.onOrder = onOrder;
    }

    public boolean increaseQuantityInStock(int quantity) {
        if (quantity > 0) {
            quantityInStock += quantity;
            return true;
        } else {
            return false;
        }
    }
    public double getUnitCostPrice() {
        return unitCostPrice;
    }

    public int quantityInStock() {
        return quantityInStock;
    }
    public boolean decreaseQuantityInStock(int quantity) {
        if (quantity > 0 && quantityInStock >= quantity) {
            quantityInStock -= quantity;
            return true;
        } else {
            return false;
        }

    }



}