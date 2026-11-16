
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          Map<String,List<String>> mapElements=new HashMap<>();
          
          for(String str :strs){
            int [] count=new int[26];
            for(char s : str.toCharArray()){
                count[s-'a']++;

            }
            String elementKey=Arrays.toString(count);

            if(!mapElements.containsKey(elementKey)){
                mapElements.put(elementKey,new ArrayList<>());
            }
            mapElements.get(elementKey).add(str);

          }
          return new ArrayList<>(mapElements.values());
        
    }



   public  boolean isAnagrams(String s,String d){
            int [] alphaNumeric=new int[26];
            if(s.length()!=d.length()){
                return false;
            }
            if(s.equals(d)) return true;
             for(int k=0;k<s.length();k++){
            alphaNumeric[s.charAt(k)-'a']++;
            alphaNumeric[d.charAt(k)-'a']--;
             }
              for(Integer count :alphaNumeric){
                if(count !=0) return false;
              }
              alphaNumeric=new int[26];
              return true;
          }
}
