// 18. Write a program that will take integer numbers as user input continuously and print the sum of numbers until user input q from the keyboard. When user input q, program will be quit. If user inputs another character, then the program will ask to input the number again.

import java.util.Scanner;
public class ContinueSumUserInput {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;

            while (true) {
                System.out.print("Enter numbers for sum (Input q when quit): ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("q")) {
                    break;
                }

                try {
                    int number = Integer.parseInt(input);
                    sum += number;
                } catch (NumberFormatException e) {
                    System.out.println("Not a valid number. Please enter any valid number or input 'q' for quit ");
                }
            }

            System.out.println("Total SUM: " + sum);
            scanner.close();
        }
    }

