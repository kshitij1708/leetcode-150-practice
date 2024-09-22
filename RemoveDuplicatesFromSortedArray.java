class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == nums[j]) {
                continue;
            }
            nums[++j] = nums[i];
        }
        return ++j;
    }
}
