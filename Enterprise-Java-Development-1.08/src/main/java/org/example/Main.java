package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        BigDecimal number = new BigDecimal(4.2344);
        System.out.println(roundBigDecimalToNearestHundredth(number));
        System.out.println(roundToTenthAndReverse(number));

    }

    public static double roundBigDecimalToNearestHundredth(BigDecimal number) {
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static BigDecimal roundToTenthAndReverse(BigDecimal number){
        BigDecimal reversed = number.multiply(new BigDecimal(-1));
        BigDecimal rounded = reversed.setScale(1, RoundingMode.HALF_UP);
        return rounded;
    }
}