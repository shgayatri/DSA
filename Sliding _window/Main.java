public class MaxSumSubarray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int k = 3;

        int maxSum = 0;
// phla loop btara h sub array khn se start hogaaaa//
        for (int i = 0; i <= n - k; i++) {
            int sum = 0;

 // dusra loop btara h start k elements kase add honge//       
  for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }

            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);
    }
}
