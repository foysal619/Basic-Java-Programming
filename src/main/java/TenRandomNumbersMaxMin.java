// 6.  Generate random 10 integer numbers in an array and print out all the numbers from array and also print the max and min number from the array

import java.util.Arrays;
import java.util.Random;

    public class TenRandomNumbersMaxMin {
        public static void main(String[] args) {
            int[] numbers = generateRandomArray(10);

            System.out.println("10 Random Numbers: " + Arrays.toString(numbers));

            int max = findMaxNumber(numbers);
            System.out.println("The Maximum: " + max);

            int minNumber = findMinNumber(numbers);
            System.out.println("The Minimum: " + minNumber);
        }

        public static int[] generateRandomArray(int size) {
            int[] array = new int[size];
            Random random = new Random();

            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt();
            }

            return array;
        }

        public static int findMaxNumber(int[] array) {
            int max = array[0];

            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }

            return max;
        }

        public static int findMinNumber(int[] array) {
            int min = array[0];

            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }

            return min;
        }
    }

