package Prefix_Sum;

import java.util.Arrays;

public class limitedsum {

    public static int[] sum(int[] nums, int[] queries) {

        Arrays.sort(nums);

        int n = nums.length;
        int m = queries.length;

        int[] prefix = new int[n];
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int[] result = new int[m];

        for (int i = 0; i < m; i++) {

            int l = 0;
            int r = n - 1;
            int maxlen = 0;

            while (l <= r) {

                int mid = l + (r - l) / 2;

                if (prefix[mid] <= queries[i]) {
                    maxlen = mid + 1;
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }

            result[i] = maxlen;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {4, 2, 3, 1};
        int[] queries = {1, 3, 4, 10};

        int[] result = sum(nums, queries);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}