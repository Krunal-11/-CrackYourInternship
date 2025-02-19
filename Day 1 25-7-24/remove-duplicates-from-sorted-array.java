class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int c = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                c++;
                nums[c - 1] = nums[i];
            }
        }
        return c;
    }
}