class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]>0){
                int r=nums[i]%10;
                sum=sum+r;
                nums[i]/=10;
            }
            nums[i]=sum;
        }
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
}