package week2_1906;
import java.math.*;
import java.text.*;
import java.util.*;

public class Money {
    public static void main(String[] args) {
        BigDecimal payment = new BigDecimal("1115.37");
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        double doublePayment = payment.doubleValue();
        String s = n.format(doublePayment);
        System.out.println(s);

        BigDecimal a = new BigDecimal("2.3");
        BigDecimal b = new BigDecimal("1.5");
        BigDecimal c = new BigDecimal("0.8");
        BigDecimal d = new BigDecimal("40");
        BigDecimal e = new BigDecimal("50");

        BigDecimal sum = a.add(b);
        System.out.println("sum: " +sum);

        BigDecimal minus = b.subtract(a);
        System.out.println("difference " + minus);

        BigDecimal quotient = b.divide(a, RoundingMode.HALF_UP);
        System.out.println("quotient "+ quotient);

        BigDecimal mult = a.multiply(b);
        System.out.println("product "+ mult);

        System.out.println(perfomOperation(new BigDecimal("2")));

    }

        public static BigDecimal perfomOperation(BigDecimal x){
        BigDecimal a = x.multiply(new BigDecimal("2.3")).add(new BigDecimal("1.5"));
        BigDecimal b = x.subtract(new BigDecimal("0.8"));
                return a.divide(b, 2, RoundingMode.HALF_UP);
    }
}