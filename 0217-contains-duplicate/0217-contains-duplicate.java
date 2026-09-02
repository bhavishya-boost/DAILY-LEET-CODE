class Solution {
    public boolean containsDuplicate(int[] nums) {
        return java.util.Arrays.stream(nums).distinct().count() < nums.length;
    }
}