class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        
        int n=nums.length;
        int d=1<<n;
        for(int mask=0;mask<d;mask++)
        {   ArrayList<Integer> a=new ArrayList<Integer>();
            for(int i=0;i<n;i++)
            {
                int f=1<<i;
                if((mask&f)!=0)
                    a.add(nums[i]);
            }
            res.add(a);
                
                
                
            }
        return res;
        
    }
}