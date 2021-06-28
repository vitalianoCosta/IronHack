package week2_1706;

import java.util.ArrayList;
import java.util.Date;

public interface TransactionList {
    Transaction getLastTransaction ();
    Transaction getTransactionByDate (Date date);
    void addTransaction (Transaction transaction);
    ArrayList<Transaction> getAllTransactions ();
}