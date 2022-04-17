import java.math.BigDecimal;

public class Change {
    public static void main(String args[]) {

        //1st variant, but still double - it is bad for the money calculation
        System.out.printf("%.2f%n", 2.00 - 1.10);

        //BigDecimal always works
        BigDecimal firstValue = new BigDecimal("2.00");
        BigDecimal secondValue = new BigDecimal("1.10");
        System.out.println(firstValue.subtract(secondValue));
    }
}
