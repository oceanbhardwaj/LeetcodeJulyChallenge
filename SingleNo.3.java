class Solution {
    public int[] singleNumber(int[] nums) {
        int res[]={0,0};
        int diff=0;
        int a=0;
        int b=0;
        diff=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            diff=diff^nums[i];
        }
     int diff1=(diff & -diff);
        for(int i=0;i<nums.length;i++)
        {
            if((diff1 & nums[i])==0)
                a=a^nums[i];
            else 
                b=b^nums[i];
        }
        res[0]=a;
        res[1]=b;
        return res;
    }
}