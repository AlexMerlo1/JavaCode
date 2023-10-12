public class App {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 42, 3, 2, 1, 0, 12, 4};
        int temp;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements 
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted Numbers:");
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            System.out.print(value + " ");
        }
    }
}
