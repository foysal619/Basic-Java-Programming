// 8. Print the prime numbers of 2 to 100

public class PrimeNumber2to100 {
        public static void main(String[] args) {
            System.out.println("Found prime number 2 to 100 is:");

            for (int N = 2; N <= 100; N++) {
                boolean isPrime = true;

                for (int i = 2; i <= Math.sqrt(N); i++) {
                    if (N % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println(N);
                }
            }
        }
    }

