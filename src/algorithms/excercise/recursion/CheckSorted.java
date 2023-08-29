package algorithms.excercise.recursion;

public class CheckSorted {

    boolean checkIfSorted(int[] arr, int len) {
        if (arr.length > len + 1) {
            return checkIfSorted(arr, len + 1) && arr[len] <= arr[len + 1] ? true : false;
        }
        return true;
    }

    public static void main(String[] args) {
        CheckSorted sorted = new CheckSorted();
        boolean b = sorted.checkIfSorted(new int[]{3, 5, 18, 30, 40}, 0);
        System.out.println(b);
    }
}
