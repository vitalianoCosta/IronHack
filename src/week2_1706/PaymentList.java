package week2_1706;

import java.util.ArrayList;
import java.util.Date;

public class PaymentList implements TransactionList{
    private ArrayList<Transaction>  allTransactions = new ArrayList<>();

    public PaymentList() {
        this.allTransactions = this.getAllTransactions();
    }

    public Transaction getLastTransaction() {
        return allTransactions.get(allTransactions.size() - 1);
    }

    public void addTransaction(Transaction transaction) {
        allTransactions.add(transaction);
    }

    public Transaction getTransactionByDate(Date date) {
        for(Transaction i : allTransactions){
            if (i.getDate().equals(date)) {
                return i;
            }
        }
        return null;
    }

    public ArrayList<Transaction> getAllTransactions() {
        return allTransactions;
    }
}