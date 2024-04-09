import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] inputArray = { 0, 0, 0, 0, 0, 1, 2, 2, 3, 3, 4, 4, 5 };
        int[] uniqueArray = removeDuplicates(inputArray);

        System.out.println("Given Array= " + Arrays.toString(inputArray));
        System.out.println("Array with Duplicates Removed= " + Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : arr) {
            set.add(num);
        }

        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }
}

