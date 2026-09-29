class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int onesCount = 0;
        int ans = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                onesCount++;
            } else {
                ans = Math.max(ans, onesCount);
                onesCount = 0;
            }
        }
        return Math.max(ans, onesCount);
    }
}