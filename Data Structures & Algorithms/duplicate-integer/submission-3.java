class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> number = new HashSet<>();

        for (int n : nums){
            if (number.contains(n)) {
                return true;
            } else {
                number.add(n);
            }
        }
        return false; 
    }
}