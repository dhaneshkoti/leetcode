class Solution {
    public boolean canAliceWin(int n) {
        
        if(n<10){
            return false;
        }
        else{    
            int x=10;
            while(true){
                n=n-x;
                x--;
                if(n<x){
                    if(x%2==0){
                        return false;
                    }
                    else{
                        return true;
                    }
                }
            }
        }
            
    }
}
