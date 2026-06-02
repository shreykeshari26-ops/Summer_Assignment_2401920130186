public class max_subarray_1 {

        public double findMaxAverage(int[] nums, int k) {
            int n = nums.length;

            // Step 1: first window sum (i = 0 → k-1)
            double sum = 0;
            for (int i = 0; i < k; i++) {
                sum += nums[i];
            }

            double maxSum = sum;

            // Step 2: slide window using YOUR logic
            for (int i = 1; i <= n - k; i++) {
                double prevElement = nums[i - 1];      // leaving
                double nextElement = nums[i + k - 1];  // entering

                sum = sum - prevElement + nextElement;

                maxSum = Math.max(maxSum, sum);
            }

            // Step 3: return average
            return maxSum / k;
        }

}
