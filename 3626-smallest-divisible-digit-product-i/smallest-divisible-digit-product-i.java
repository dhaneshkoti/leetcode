class Solution {
    public int smallestNumber(int n, int t) {
        int ans=0;
        for(int i=n;i<n+t;i++){
            int num=i;
            int res=1;
            while(num!=0){
                res=res*(num%10);
                num/=10;
            }
            if(res%t==0){
                ans=i;
                break;
            }
        }
        return ans;
    }
}