public class FindTheBiggestNumber {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {10, 20, 30, 40, 50};

        // Find the biggest number in the array
        int maxNumber = findBiggestNumber(numbers);

        // Print the result
        System.out.println("The biggest number in the array is: " + maxNumber);
    }

    public static int findBiggestNumber(int[] array) {
        

        int max = array[0]; // Assume the first element is the largest

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update max if a larger number is found
            }
        }

        return max;
    }
}
