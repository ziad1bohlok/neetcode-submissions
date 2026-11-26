class Solution {
    public int[] productExceptSelf(int[] nums) {
       int numLimit=nums.length;
       int [] result=new int[numLimit];
       result[0]=1;
       for(int i=1;i< numLimit; i++){
        result[i]=result[i-1]*nums[i-1];
       }
       int suffix=1;
       for(int i=numLimit-1;i>=0;i--){
        result[i]*=suffix;
        suffix*=nums[i];
       }
       return result;
        /*return IntStream.range(0,nums.length)
        .map(
            i->{
                   return  IntStream.range(0,nums.length)
                   .filter(j->j!=i)
                   .map(j->nums[j])
                   .reduce(1,(k,l)->k*l);
                
            }
        ).toArray();*/
     
    }
}  
