public class Invoice {
    private String product_number;
    private String product_description;
    private int quantity;
    private double pricePerItem;

    // Konstruktor
    public Invoice(String product_number, String product_description, int quantity, double pricePerItem) {
        setProduct_number(product_number);
        setProduct_description(product_description);
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    // Metody get i set dla każdej zmiennej
    public String getProduct_number() {
        return product_number;
    }

    public void setProduct_number(String product_number) {
        this.product_number = product_number;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    // Metoda Amount
    public double Amount() {
        if (quantity <= 0 || pricePerItem <= 0) {
            return 0;
        } else {
            return quantity * pricePerItem;
        }
    }
}
