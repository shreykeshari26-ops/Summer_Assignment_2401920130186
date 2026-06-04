package Day_3;

public class Square_of_sorted_array {
    public int[] sortedSquares(int[] nums) {
        for (int i=0; i<nums.length;i++){
            //nums[i]=int Math.pow(nums[i],2);
            nums[i]= nums[i]*nums[i];
        }
        for (int pass = 0; pass < nums.length; pass++) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }
        return nums;
    }
}
