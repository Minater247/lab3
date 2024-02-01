public class ArrayExamples {

    // Changes the input array to be in reversed order
    static void reverseInPlace(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        int[] arrCopy = arr.clone();
        for (int i = 0; i < arr.length; i += 1) {
            arr[i] = arrCopy[arr.length - i - 1];
        }
    }

    // Returns a *new* array with all the elements of the input array in reversed
    // order
    static int[] reversed(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i += 1) {
            newArray[i] = arr[arr.length - i - 1];
        }
        return newArray;
    }

    // Averages the numbers in the array (takes the mean), but leaves out the
    // lowest number when calculating. Returns 0 if there are no elements or just
    // 1 element in the array
    static double averageWithoutLowest(double[] arr) {
        // Not tested for, but
        if (arr == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        if (arr.length < 2) {
            return 0.0;
        }
        double lowest = arr[0];
        for (double num : arr) {
            if (num < lowest) {
                lowest = num;
            }
        }
        double sum = 0;
        boolean hasRemoved = false;
        for (double num : arr) {
            if (num == lowest && !hasRemoved) {
                hasRemoved = true;
                continue;
            }
            sum += num;
        }
        return sum / (arr.length - 1);
    }

}