// 5. Write a program that will find your key is found in the given array using linear search method numbers=[1,6,9,3,5,4,7]
//key=5

public class LinearSearch {
        public static void main(String[] args) {
            int[] n = {1, 6, 9, 3, 5, 4, 7};
            int k = 5;

            int index = linearSearch(n, k);

            if (index != -1) {
                System.out.println("Key found at index: " + index);
            } else {
                System.out.println("Key not found");
            }
        }

        public static int linearSearch(int[] arr, int k) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == k) {
                    return i;
                }
            }

            return -1;
        }
    }

