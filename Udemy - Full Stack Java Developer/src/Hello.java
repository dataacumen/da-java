import java.math.BigDecimal;

public class Hello {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        System.out.println("Hello World! Result: " + (value1 + value2));

        int marker = 1024;
        double percentage = marker * 0.46f;
        System.out.println("Percentage: " + percentage);

        char unicodeTest = '\u00BB';
        System.out.println("Unicode u00BB: " + unicodeTest);

        double x = 1.05;
        double y = 2.55;
        BigDecimal a = new BigDecimal(1.05);
        BigDecimal b = new BigDecimal(2.55);
        BigDecimal c = new BigDecimal("1.05");
        BigDecimal d = new BigDecimal("2.55");

        System.out.println("Background Rounding: " + (x+y) + " and some more: " + a.add(b) + " what you expected: " + c.add(d));

    }
}
