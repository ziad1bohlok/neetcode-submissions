class Solution {
    public int[] twoSum(int[] nums, int target) {
        
          int [] solution=new int [2];
         if(nums[0]==nums[1] && nums[0]+nums[1]==target ) {
                solution[0]=0;
                solution[1]=1;
                return solution;
         } 


         for (int i=0,j=1; i< nums.length && j<nums.length-1;i++,j++){
                if(nums[i]==nums[j]){
                solution[0]=i;
                solution[1]=j;
                return solution;
                }
         }

        for(int i=0 ; i< nums.length;i++){
          for(int j=1;j<nums.length;j++){
            if(nums[i]+nums[j]==target &&i!=j){
                solution[0]=i;
                solution[1]=j;
                return solution;
            }
          }
        }

        return new int[0];
    }
}
