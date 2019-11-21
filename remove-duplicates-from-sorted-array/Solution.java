class Solution {
    public int removeDuplicates(int[] nums) {
        int lengthOfNums = nums.length;
        if(lengthOfNums == 0) return 0;
        int slowPointer = 0;
        for(int fastPointer = 1; fastPointer < lengthOfNums; fastPointer++) {
            if(nums[fastPointer] != nums[slowPointer]) {
                slowPointer++;
                nums[slowPointer] = nums[fastPointer];
            }
        }
        
        return slowPointer + 1;
    }
}
