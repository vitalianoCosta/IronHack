package week2_1906;

import java.math.RoundingMode;

import java.math.BigDecimal;

public class BiDec {
    public static void main(String[] args) {

        BigDecimal task = new BigDecimal(0.7);
        BigDecimal fee = new BigDecimal(0.1);
        BigDecimal client = new BigDecimal(400);

        BigDecimal sum = task.add(fee);
        /* BigDecimal mult =
        BigDecimal displayVal = sum.setScale(2,RoundingMode.HALF_EVEN);
        System.out.println(displayVal);
        /* NumberFormat n == NumberFormat.getCurrencyInstance(Locale.US); */
    }
}