import java.util.*;

public class Main {

    public static int firstOccurrence(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                end = mid - 1;   // left search
            } 
            else if (nums[mid] < target) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int lastOccurrence(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                start = mid + 1; // right search
            } 
            else if (nums[mid] < target) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int first = firstOccurrence(nums, target);
        int last = lastOccurrence(nums, target);

        System.out.println(first + " " + last);
    }
}
