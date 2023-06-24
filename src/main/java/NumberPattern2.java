// 10. Write a program that will give following output:
//12345
//2345
//345
//45
//5

public class NumberPattern2 {
        public static void main(String[] args) {
            int n = 12345;
            String N = Integer.toString(n);
            for (int i = 0; i < N.length(); i++)
            {
                System.out.println(N.substring(i));
            }
        }
    }



