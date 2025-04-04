class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        Map<Character,Integer> req=new HashMap<>();
        for(char ch:t.toCharArray()){
            req.put(ch,1+req.getOrDefault(ch,0));
        }
        int stillneed=req.size();
        int we=0,ws=0,n=s.length(),mn=n+1,ans_ws=-1,ans_we=-1;
        for(we=0;we<n;we++){
            char ch=s.charAt(we);
            if(req.containsKey(ch)){
                req.put(ch,req.get(ch)-1);
                if(req.get(ch)==0){
                    stillneed--;
                }
                if(stillneed==0){
                    if(we-ws+1<mn){
                        mn=we-ws+1;
                        ans_we=we;
                        ans_ws=ws;
                    }
                    while(ws<=we){
                        char del=s.charAt(ws++);
                        if(req.containsKey(del)){
                            req.put(del,req.get(del)+1);
                            if(req.get(del)==1){
                                stillneed++;
                                if(we-ws+2<mn){
                                    mn=we-ws+2;
                                    ans_we=we;
                                    ans_ws=ws-1;
                                }
                                break;
                            }
                        }
                    }
                }
            }
        }
        if(ans_we==-1){
            return "";
        }
        return s.substring(ans_ws,ans_we+1);
    }
}