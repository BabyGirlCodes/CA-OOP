public class Supplier {

    private String name;
    private String address;
    private double amountOwed;
    private final double creditLimit;

    public Supplier(String name, String address, double amountOwed, double creditLimit) {
        this.name = name;
        this.address = address;
        this.amountOwed = amountOwed;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAmountOwed() {
        return amountOwed;
    }

    public void increaseOwed(double amount) {
        if (amountOwed + amount <= creditLimit) {
            amountOwed += amount;
        }
    }

    public void decreaseOwed(double amount) {
        if (amountOwed >= amount) {
            amountOwed -= amount;
        }
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", amountOwed=" + amountOwed +
                ", creditLimit=" + creditLimit +
                '}';
    }


}