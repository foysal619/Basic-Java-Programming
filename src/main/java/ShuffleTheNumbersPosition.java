// 12. Write a program that will shuffle (values will randomly change their position) from the given array numbers=[1,2,3,4,5,6,7,8,9,0]
//random output: 3 5 0 1 7 9 6 4 2 8

import java.util.Arrays;
import java.util.Random;

public class ShuffleTheNumbersPosition {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
            shuffleArray(numbers);
            System.out.println("After the shuffle: " + Arrays.toString(numbers));
        }

        public static void shuffleArray(int[] array) {
            Random random = new Random();

            for (int i = array.length - 1; i > 0; i--) {
                int j = random.nextInt(i + 1);
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }

