class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            h.put(nums[i],h.getOrDefault((nums[i]),0)+1);
        }
        PriorityQueue<Integer> q=new PriorityQueue<Integer>(
        new Comparator<Integer>(){
            public int compare(Integer a,Integer b)
            {
                int b1=h.get(a);
                int b2=h.get(b);
                if(b1==b2)
                    return a-b;
                return b2-b1;
            }
        });
        for(int i:nums)
            q.add(i);
        int count=0;
        int arr[]=new int[k];
        while(!q.isEmpty() && k>0)
        {
            arr[count++]=q.peek();
            int d=h.get(arr[count-1]);
            while(d>0)
            {q.poll();
            d--;}
            k--;
            
        }
        return arr;
        
    }
}