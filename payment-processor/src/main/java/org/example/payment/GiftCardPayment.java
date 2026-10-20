package org.example.payment;

import org.example.model.PaymentResult;

public class GiftCardPayment extends PaymentMethod{
    private final String code;
    private double balance;

    public GiftCardPayment(String code, double balance) {
        super("GiftCard");
        this.code = code;
        this.setBalance(balance);
    }

    @Override
    public PaymentResult processPayment(double amount){
        if (balance >= amount) {
            balance -= amount;
            return new PaymentResult(true, "Paid " + amount + " using gift card");
        }
        return new PaymentResult(false, "Insufficient funds");
    }

    public String getCode() {
        return code;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
