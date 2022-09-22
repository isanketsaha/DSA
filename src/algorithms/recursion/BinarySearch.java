package algorithms.recursion;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = {3, 6, 10, 13, 14, 18, 21};
        int i = bs.search(arr, 3, 0, arr.length - 1);
        System.out.println(i);

    }

    public int search(int arr[], int searchItem, int startIndex, int endIndex) {
        if (arr.length == 0 || startIndex >= endIndex) {
            if (arr[startIndex] == searchItem) {
                return startIndex;
            } else
                return -1;
        } else {
            int mid = (startIndex + endIndex) / 2;
            if (arr[mid] == searchItem) {
                return mid;
            } else if (arr[mid] > searchItem) {
                return search(arr, searchItem, startIndex, mid - 1);
            } else {
                return search(arr, searchItem, mid + 1, endIndex);
            }
        }
    }
}
