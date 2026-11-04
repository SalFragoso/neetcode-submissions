class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numsHashMap = new HashMap<>(); 

        for(int i = 0; i < nums.length; i++) {

            if (numsHashMap.containsKey(target - nums[i])){
                return new int[]{numsHashMap.get(target - nums[i]), i};
            }

            numsHashMap.put(nums[i], i); 
        
        }        

        return new int [0]; //for the compile ig.
    }
}
