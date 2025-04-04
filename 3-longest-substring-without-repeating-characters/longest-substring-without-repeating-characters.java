class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.isEmpty()){
            return 0;
        }
        Map<Character,Integer> freq=new HashMap<>();
        int ws=0,we=0,mx=0,n=s.length();
        for(we=0;we<n;we++){
            char ch=s.charAt(we);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
            if(freq.get(ch)==1){
                mx=Math.max(mx,we-ws+1);
            }
            else{
                while(ws<=we){
                    char del=s.charAt(ws);
                    ws++;
                    freq.put(del,freq.get(del)-1);
                    if(freq.get(del)==1){
                        break;
                    }
                }
                mx=Math.max(mx,we-ws+1);
            }
        }
        return mx;
    }
}