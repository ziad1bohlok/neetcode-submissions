class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      Map<Integer,Integer> numCounter=new HashMap<>();
   int[] freq = new int[k];
     for(int i=0;i<nums.length;i++){

        if(numCounter.containsKey(nums[i])){
            numCounter.put(nums[i],numCounter.getOrDefault(nums[i], 0) + 1);
        }else{
            numCounter.put(nums[i],0);
        }

     }
     
        List<Map.Entry<Integer, Integer>> sorted =
        numCounter.entrySet()
                  .stream()
                  .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                  .collect(Collectors.toList());

        for(int i=0;i<k;i++){
            freq[i]=sorted.get(i).getKey();
        }
        return freq;
    }
}
