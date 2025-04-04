class Solution {
    public int smallestNumber(int n) {
        // Scanner sc=new Scanner(System.in);
        // n=sc.nextInt();
        int x=0;
        for(int i=1;i<=n;i++){
            x=(x*2)+1;
            if(x>=n){
                return x;
            }
        }
    return x;
    }
}