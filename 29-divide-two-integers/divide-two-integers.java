class Solution {
    public int divide(int dividend, int divisor) {
        int quotient;
        quotient=dividend/divisor;
        if(dividend==-2147483648 && divisor==-1){
            // return (int)(Math.pow(2,31)-1);
            return (int)2147483647;
        }
        else{
            return (int)quotient;
        }
    }
}