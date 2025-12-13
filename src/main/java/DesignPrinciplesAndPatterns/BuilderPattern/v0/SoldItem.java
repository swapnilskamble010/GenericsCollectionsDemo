package DesignPrinciplesAndPatterns.BuilderPattern.v0;

public class SoldItem {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private boolean isPrime;
    private double discount;
    private String paymentMethod;

    public SoldItem(SoldItemBuilder soldItemBuilderv0) {
        this.id = soldItemBuilderv0.getId();
        this.name = soldItemBuilderv0.getName();
        this.price = soldItemBuilderv0.getPrice();
        this.quantity = soldItemBuilderv0.getQuantity();
        this.isPrime = soldItemBuilderv0.isPrime();
        this.discount = soldItemBuilderv0.getDiscount();
        this.paymentMethod = soldItemBuilderv0.getPaymentMethod();
    }

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
        if(quantity < 5){
            throw new IllegalArgumentException("Quantity must be greater than or equal to 5");
        }
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
