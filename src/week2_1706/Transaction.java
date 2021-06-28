package week2_1706;

import java.util.Date;

public class Transaction{
    private String sellerAccountNumber;
    private String buyerAccountNumber;
    private double amount;
    private Date date;

    public Transaction(String sellerAccountNumber, String buyerAccountNumber, double amount, Date date) {
        this.sellerAccountNumber = sellerAccountNumber;
        this.buyerAccountNumber = buyerAccountNumber;
        this.amount = amount;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public String toString() {
        return "Transaction: \n" +
                "sellerAccountNumber: '" + sellerAccountNumber + '\n' +
                ", buyerAccountNumber: '" + buyerAccountNumber + '\n' +
                ", amount: " + amount +
                "\n, date=" + date + "\n\n";
    }
}