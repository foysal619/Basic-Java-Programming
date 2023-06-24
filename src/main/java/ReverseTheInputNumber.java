// 13. Take any number as input and print the reverse of the number input: 12345
//output: 54321

import java.util.Scanner;
public class ReverseTheInputNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter any Number: ");
            int number = scanner.nextInt();

            int R = 0;
            while (number != 0) {
                int digit = number % 10;
                R = R * 10 + digit;
                number /= 10;
            }

            System.out.println("After Reverse: " + R);
            scanner.close();
        }
    }

