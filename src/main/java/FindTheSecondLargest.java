// 11. Find out the second largest element of the given array numbers=[5,3,9,7,4,1,8]

public class FindTheSecondLargest {
        public static void main(String[] args) {
            int[] numbers = {5, 3, 9, 7, 4, 1, 8};
            int secondLargest = findSecondLargest(numbers);

            System.out.println("Second Largest Number is: " + secondLargest);
        }

        public static int findSecondLargest(int[] arr) {
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                } else if (arr[i] > secondLargest && arr[i] < largest) {
                    secondLargest = arr[i];
                }
            }

            return secondLargest;
        }
    }


