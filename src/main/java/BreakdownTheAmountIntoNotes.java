// 7. Write a program that will breakdown the amount and count notes for any given amount. Here is the notes in the given array:
//notes=[1000,500,200,100,50,20,10,5,2,1]
//
//Example 1: User input: 575
//Output:
//500 1
//50 1
//20 1
//5 1
//Example 2: User input: 2148
//Output:
//1000 2
//100 1
//20 2
//5 1
//2 1
//1 1


import java.util.Scanner;
public class BreakdownTheAmountIntoNotes {
    public static void main(String[] args) {
            int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter any amount for breakdown: ");
            int amount = scanner.nextInt();
            scanner.close();

            System.out.println("Breakdown Notes:");
            for (int note : notes) {
                if (amount >= note) {
                    int count = amount / note;
                    System.out.println(note + " " + count);
                    amount %= note;
                }
            }
        }
    }

