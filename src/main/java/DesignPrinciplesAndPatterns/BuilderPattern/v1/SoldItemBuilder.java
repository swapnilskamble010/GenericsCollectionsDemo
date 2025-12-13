package DesignPrinciplesAndPatterns.BuilderPattern.v1;

public class SoldItemBuilder {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private boolean isPrime;
    private double discount;
    private String paymentMethod;

    public SoldItem build(){
        return new SoldItem(this);
    }

    public int getId() {
        return id;
    }

    public SoldItemBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public SoldItemBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public SoldItemBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public SoldItemBuilder setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public SoldItemBuilder setPrime(boolean prime) {
        isPrime = prime;
        return this;
    }

    public double getDiscount() {
        return discount;
    }

    public SoldItemBuilder setDiscount(double discount) {
        this.discount = discount;
        return this;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public SoldItemBuilder setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }
}
