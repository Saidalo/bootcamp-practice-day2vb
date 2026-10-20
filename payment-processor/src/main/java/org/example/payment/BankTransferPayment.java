package org.example.payment;

import org.example.model.PaymentResult;

public class BankTransferPayment extends PaymentMethod {
    private final String iban;
    private final String accName;

    public BankTransferPayment(String iban, String accName) {
        super("BankTransfer");
        this.iban = iban;
        this.accName = accName;
    }

    @Override
    public PaymentResult processPayment(double amount) {
        return new PaymentResult(true,
                "Paid " + amount +
                        " by bank transfer from " + accName +
                        " with iban:" + iban);
    }
}
