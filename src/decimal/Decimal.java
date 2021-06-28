package decimal;

import java.math.RoundingMode;

import java.math.BigDecimal;



public class Decimal {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(0.7);
        BigDecimal b = new BigDecimal(0.1);
        BigDecimal c = new BigDecimal(0.2);

        BigDecimal sum = a.add(b);
        BigDecimal displayVal = sum.setScale(2,RoundingMode.HALF_EVEN);
        System.out.println(displayVal);
    }


}
