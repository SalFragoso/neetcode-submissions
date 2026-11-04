class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> numset = new HashSet<>(); 

        for(int number : nums){ 

            if(numset.contains(number)){ 
                    return true;
            }

            numset.add(number); 
        }

        return false;
    }
}