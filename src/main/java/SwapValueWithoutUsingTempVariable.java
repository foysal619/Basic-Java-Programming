
// 2. Suppose, a=10 and b=20. Now swap the value without a temp variable. Output: a=20, b=10
public class SwapValueWithoutUsingTempVariable {
    public static void main(String[] args) {
            int a = 10;
            int b = 20;

            System.out.println("Given Output:");
            System.out.println("a=" + a);
            System.out.println("b=" + b);

        int b1 = a + b;
            a = b1 - a;
            b = b1 - b;


            System.out.println("After Done Swap:");
            System.out.println("a=" + a);
            System.out.println("b=" + b);
        }
    }

