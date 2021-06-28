package week2_1706;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Transaction transaction1 = new Transaction("032-049-02384-0238", "3209472-3423423", 2312312, new Date(34));
        Transaction transaction2 = new Transaction("23958723908754", "23984672234897", 71826431, new Date(23));
        Transaction transaction3 = new Transaction("892376492386454", "78923649782365423", 321541235, new Date(12));

        PaymentList paymentList1 = new PaymentList();

        paymentList1.addTransaction(transaction1);
        paymentList1.addTransaction(transaction2);
        paymentList1.addTransaction(transaction3);

        System.out.println(paymentList1.getAllTransactions());

    }
}