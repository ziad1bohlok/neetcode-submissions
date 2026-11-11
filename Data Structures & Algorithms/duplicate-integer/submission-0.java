class Solution {
    public boolean hasDuplicate(int[] nums) {
         boolean appear=false;
         int count=0;
        for(int i=0;i<nums.length;i++){
             count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
                if(count==2){
                    return true;
                }

            }
        
        }
        return  appear;
        
    }
}