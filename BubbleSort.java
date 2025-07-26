import java.util.Scanner;

class BubbleSort {
    // An optimized version of Bubble Sort for strings
    static void bubbleSort(String arr[], int n) {
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                // Use compareTo for lexicographical comparison
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap arr[j] and arr[j + 1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Break early if no swap was done (already sorted)
            if (!swapped)
                break;
        }
    }

    // Function to print the array
    static void printArray(String arr[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = Integer.parseInt(scn.nextLine());

        String[] arr = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextLine();
        }

        // Sort the array
        bubbleSort(arr, n);

        // Display the sorted array
        System.out.println("Sorted strings:");
        printArray(arr, n);
    }
}
