package algorithms.recursion;

import java.util.Arrays;

public class RecursionSample {

    public static void main(String[] args) {
        RecursionSample rs = new RecursionSample();
        int[] ints = {2, 1, 5, 4};
        int sum = rs.sum(ints);
        int count = rs.count(ints, 0);
        int max = rs.findMax(ints, 0);

        System.out.println(max);
    }

    public int sum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else {
            return arr[arr.length - 1] + sum(Arrays.copyOf(arr, arr.length - 1));
        }
    }

    public int count(int[] arr, int count) {
        if (arr.length == 0) {
            return count;
        } else {
            return count(Arrays.copyOf(arr, arr.length - 1), ++count);
        }
    }

    public int findMax(int[] arr, int highest) {
        if (arr.length == 0) return highest;
        else {
            return findMax(Arrays.copyOf(arr, arr.length - 1), Math.max(highest, arr[arr.length - 1]));
        }
    }

}
