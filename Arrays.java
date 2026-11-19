
public class ArrayUtil {

    /**
     * 1. Prints all positive elements of an integer array.
     *
     * @param n the input integer array
     */
    public static void printPositive(int[] n) {
        for (int num : n) {
            if (num > 0) {
                System.out.println(num);
            }
        }
    }

    /**
     * 2. Prints the digits of each array element in reverse order.
     * Example: 257 -> 752.
     *
     * @param s the input short array
     */
    public static void printReverseDigits(short[] s) {
        for (short num : s) {
            int number = Math.abs((int) num);
            int reversed = 0;

            while (number > 0) {
                reversed = reversed * 10 + number % 10;
                number /= 10;
            }

            if (num < 0) {
                reversed = -reversed;
            }

            System.out.println(reversed);
        }
    }

    /**
     * 3. Finds and prints the largest element of a long array.
     *
     * @param l the input long array
     */
    public static void printMax(long[] l) {
        if (l.length == 0) {
            return;
        }

        long max = l[0];

        for (long num : l) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println(max);
    }

    /**
     * 4. Finds and prints the smallest element of a float array.
     *
     * @param f the input float array
     */
    public static void printMin(float[] f) {
        if (f.length == 0) {
            return;
        }

        float min = f[0];

        for (float num : f) {
            if (num < min) {
                min = num;
            }
        }

        System.out.println(min);
    }

    /**
     * 5. Copies all elements of one integer array into another.
     *
     * @param n the source array
     * @param m the destination array
     */
    public static void copyArray(int[] n, int[] m) {
        int length = Math.min(n.length, m.length);

        for (int i = 0; i < length; i++) {
            m[i] = n[i];
        }
    }

    /**
     * 6. Creates a new array containing the sums
     * of corresponding elements of two arrays.
     *
     * @param array1 the first input array
     * @param array2 the second input array
     * @return a new array containing the sums
     */
    public static int[] sumArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Arrays must have the same length");
        }

        int[] array3 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] + array2[i];
        }

        return array3;
    }

    /**
     * 7. Counts how many times a given number occurs in an array.
     *
     * @param array the input array
     * @param k the number to search for
     * @return the number of occurrences
     */
    public static int countNumber(int[] array, int k) {
        int count = 0;

        for (int num : array) {
            if (num == k) {
                count++;
            }
        }

        return count;
    }

    /**
     * 8. Prints all unique triples of elements.
     * The order of elements in a triple does not matter.
     *
     * @param array the input array
     */
    public static void printTriples(int[] array) {
        int[] copy = array.clone();

        // Sort the copy in ascending order
        for (int i = 0; i < copy.length - 1; i++) {
            for (int j = i + 1; j < copy.length; j++) {
                if (copy[i] > copy[j]) {
                    int temp = copy[i];
                    copy[i] = copy[j];
                    copy[j] = temp;
                }
            }
        }

        for (int i = 0; i < copy.length - 2; i++) {
            if (i > 0 && copy[i] == copy[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < copy.length - 1; j++) {
                if (j > i + 1 && copy[j] == copy[j - 1]) {
                    continue;
                }

                for (int k = j + 1; k < copy.length; k++) {
                    if (k > j + 1 && copy[k] == copy[k - 1]) {
                        continue;
                    }

                    System.out.println(
                        "{" + copy[i] + ", " + copy[j] + ", " + copy[k] + "}"
                    );
                }
            }
        }
    }

    /**
     * 9. Sorts an integer array in descending order.
     *
     * @param array the input array
     * @return the sorted array
     */
    public static int[] sortDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

    /**
     * 10. Moves all even numbers to the beginning
     * and all odd numbers to the end, preserving their order.
     *
     * @param array the input array
     * @return a new array with even numbers first
     */
    public static int[] evenBeforeOdd(int[] array) {
        int[] result = new int[array.length];
        int index = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }

        for (int num : array) {
            if (num % 2 != 0) {
                result[index++] = num;
            }
        }

        return result;
    }

    /**
     * 11. Removes all zeros from a double array.
     *
     * @param array the input array
     * @return a new array without zeros
     */
    public static double[] removeZeros(double[] array) {
        int count = 0;

        for (double num : array) {
            if (num != 0.0) {
                count++;
            }
        }

        double[] result = new double[count];
        int index = 0;

        for (double num : array) {
            if (num != 0.0) {
                result[index++] = num;
            }
        }

        return result;
    }

    
/**
 * Finds an increasing subsequence by selecting the first possible
 * element that is greater than or equal to the previous selected element.
 *
 * @param array the input array of integers
 * @return an array containing the selected increasing subsequence
 */
public static int[] longestIncreasingSubsequence(int[] array) {
    int[] best = new int[array.length];
    int maxLength = 0;

    for (int i = 0; i < array.length; i++) {
        int[] current = new int[array.length];
        int count = 1;

        current[0] = array[i];
        int last = array[i];

        for (int j = i + 1; j < array.length; j++) {
            if (array[j] >= last) {
                current[count] = array[j];
                last = array[j];
                count++;
            }
        }

        if (count > maxLength) {
            maxLength = count;

            for (int k = 0; k < count; k++) {
                best[k] = current[k];
            }
        }
    }

    int[] result = new int[maxLength];

    for (int i = 0; i < maxLength; i++) {
        result[i] = best[i];
    }

    return result;
}

    /**
     * 13. Converts a binary number represented by an array
     * into its decimal representation.
     *
     * @param array the binary digits, from left to right
     * @return the decimal representation
     */
    public static long binaryToDecimal(int[] array) {
        long decimal = 0;

        for (int bit : array) {
            if (bit != 0 && bit != 1) {
                throw new IllegalArgumentException("Binary digits must be 0 or 1");
            }

            decimal = decimal * 2 + bit;
        }

        return decimal;
    }

    /**
     * 14. Prints all elements above the main diagonal.
     *
     * @param matrix the input matrix
     */
    public static void printAboveDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }

    /**
     * 15. Transposes a square matrix across its main diagonal.
     *
     * @param matrix the square matrix to transpose
     */
    public static void transpose(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    /**
     * 16. Checks whether the sum of every row is even.
     * Prints YES if all row sums are even, otherwise NO.
     *
     * @param matrix the input matrix
     */
    public static void checkRowSums(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            long sum = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }

            if (sum % 2 != 0) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
