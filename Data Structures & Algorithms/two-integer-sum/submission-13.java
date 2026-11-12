class Solution {
    public int[] twoSum(int[] nums, int target) {
        
         Map<Integer,Integer>sums=new HashMap<>();

         for(int i=0;i<nums.length;i++){
            
            int value=target-nums[i];

            if(sums.containsKey(value)){
             return new int[]{sums.get(value),i};
            }
            sums.put(nums[i],i);

         }
            return new int[0];
}
}
