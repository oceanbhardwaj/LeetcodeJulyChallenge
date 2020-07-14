class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> a=new ArrayList<List<Integer>>();
        int j=0;
        Arrays.sort(nums);
        for(int i=0;i<=n-3;i++)
        { if(i==0||i>0 && nums[i]!=nums[i-1])
           j=i+1;
         else
             continue;
         int k=n-1;
         while(j<k)
         {
             if(nums[i]+nums[j]+nums[k]==0)
             {
                 a.add(Arrays.asList(nums[i],nums[j],nums[k]));
               while(j<k && nums[j]==nums[j+1]) 
                   j++;
                 while(j<k && nums[k]==nums[k-1])
                     k--;
                 
                 j++;
                 k--;}
            else if(nums[i]+nums[j]+nums[k]>0)
                 k--;
             else
                 j++;}}
         
         
         return a;}
             
             
                 
                 
                 
                 
             
             
             
             
             
             
             
             
         

        
        
        
        
        
        
        
        
        
        
        
        
        
    
}