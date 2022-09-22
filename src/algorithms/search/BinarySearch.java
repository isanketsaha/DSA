package algorithms.search;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] ints = {2, 5, 9, 13, 15, 16, 18, 31, 35, 36, 42};
        System.out.println(bs.searchUsingRecursion(ints, 7, 0, ints.length - 1));
    }

    public int search(int[] arr, int element) {
        if (arr.length > 0) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] == element) {
                    return mid;
                } else if (arr[mid] < element) {
                    start = mid + 1;
                } else if (arr[mid] > element) {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }

    public int searchUsingRecursion(int[] arr, int element, int start, int end) {
        if (start <= end && arr.length > 0) {
            int mid = (start + end) / 2;
            if (arr[mid] == element) {
                return mid;
            } else if (arr[mid] < element) {
                return searchUsingRecursion(arr, element, mid + 1, end);
            } else {
                return searchUsingRecursion(arr, element, start, mid - 1);
            }
        } else {
            return -1;
        }
    }
}
