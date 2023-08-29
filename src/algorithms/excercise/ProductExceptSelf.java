package algorithms.excercise;

import java.util.Arrays;

public class ProductExceptSelf {

    /* We will do two iteration, one from front and another from back.
        when we iterate we will store the num value previously multiplied as the current value index.
         and then same from the back iteration we will perform. */
    public int[] productExceptSelf(int[] nums) {
        int num = 1;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = num;
            num = num * nums[i];
        }
        num = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] = arr[i] * num;
            num = num * nums[i];
        }

        System.out.println(Arrays.toString(arr));
        return null;
    }

    public static void main(String[] args) {
        ProductExceptSelf self = new ProductExceptSelf();
        self.productExceptSelf(new int[]{1, 2, 3, 4});
    }
}
