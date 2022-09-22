package algorithms.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        SelectionSort sSort = new SelectionSort();
        int[] sort = sSort.sort(new int[]{43, 21, 23, 11, 32, 34, 43, 01, 21, 32, 34, 50});
        System.out.println(Arrays.toString(sort));
    }

    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
