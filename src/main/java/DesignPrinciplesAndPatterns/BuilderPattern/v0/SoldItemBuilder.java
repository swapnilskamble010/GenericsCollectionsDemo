package DesignPrinciplesAndPatterns.BuilderPattern.v0;

public class SoldItemBuilder {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private boolean isPrime;
    private double discount;
    private String paymentMethod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public void setPrime(boolean prime) {
        isPrime = prime;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
