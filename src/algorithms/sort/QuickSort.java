package algorithms.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {32, 21, 12, 11, 10, 17, 81, 9, 43, 32,46,12,23,1};
        QuickSort qsort = new QuickSort();
        qsort.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    private void sort(int[] arr, int start, int end) {
        if(start < end){
        int i = partition(arr, start, end);
        sort(arr, start, i-1);
        sort(arr, i+1, end);
        }


    }

    int partition(int[] arr, int start, int end){
            int pivot = end;
            int i = start;
            for(int j = start ; j<end;j++){
                if(arr[j] < arr[pivot]){
                    swap(arr, j,i);
                    i++;
                }
            }
            swap(arr,i,pivot);
            return i;
    }

    void swap(int[] arr, int from, int to){
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }

}
