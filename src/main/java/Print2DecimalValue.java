//3. Suppose a=15.5276. print the value upto 2 decimal point. Output: a=15.52
public class Print2DecimalValue {
        public static void main(String[] args) {
            double a = 15.5276;
            double twoValue = Math.round(a*100.0)/100.0;
            System.out.printf("a=%.2f%n", twoValue);
        }
    }

