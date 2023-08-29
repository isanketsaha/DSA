package algorithms.excercise;


/*Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
 find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2]
 where 1 <= index1 < index2 < numbers.length.
Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.*/

import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {

//        WE WILL USE TWO POINTERS , ONE FROM ONE END AND ANOTHER FROM ANOTHER END
        int end = numbers.length - 1;
        int start = 0;
        while (start < numbers.length) {
            if (numbers[start] + numbers[end] == target)
                return new int[]{start + 1, end + 1};
            else if (numbers[start] + numbers[end] > target)
                --end;
            else
                ++start;
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSum sum = new TwoSum();
        System.out.println(Arrays.toString(sum.twoSum(new int[]{-1, 0}, -1)));
    }
}
