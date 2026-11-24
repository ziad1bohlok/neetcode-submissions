class Solution {

    public String encode(List<String> strs) {
        if(strs.size()==0) return "";
       String str=strs.stream()
       .map(x->x.isEmpty() ? "&nbsp" : x)
       .collect(Collectors.joining(",dummy#@!"));
       return str;
    }

    public List<String> decode(String str) {
          if(str.isEmpty()) return new ArrayList<String>();
         List<String> list=Arrays.stream(str.split(",dummy#@!"))
         .map(s->s.replace("&nbsp","")).collect(Collectors.toList());
         return list;
    }
}
