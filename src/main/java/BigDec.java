import java.math.BigDecimal;

/**
 * For how to work with BigDecimal, see Java Magazine article
 * "Four common pitfalls of the BigDecimal class and how to avoid them"
 */
public class BigDec {
    public static void main(String[] args) {
        BigDecimal x = new BigDecimal(0.1);
        System.out.println("x=" + x);

        BigDecimal y = new BigDecimal("0.1");
        System.out.println("y=" + y);

        BigDecimal z = BigDecimal.valueOf(0.1);
        System.out.println("z=" + z);
        
        double d = 1_000.00;
        System.out.println("d = " + d);
        
    }
}
