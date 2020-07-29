import java.util.*;
class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        HashMap< Character,Integer> h=new HashMap<>();
        for(int i=0;i<tasks.length;i++)
        {
            h.put(tasks[i],h.getOrDefault(tasks[i],0)+1);
        }
        int cycles=0;
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new Comparator<Integer>(){
            public int compare(Integer a,Integer b)
            {
               
                return b-a;
            }
            
        });
       // PriorityQueue<Integer> pq=new PriorityQueue<Integer>((a,b)->b-a);
         
        pq.addAll(h.values());
        
        
        while(!pq.isEmpty())
        {
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<n+1;i++)
            {   if(!pq.isEmpty())
                l.add(pq.remove());
            }
            for(int i:l)
            {
                if(--i>0)
                {
                    pq.add(i);
                }
            }
            if(!pq.isEmpty())
                cycles=cycles+n+1;
            else
                cycles=cycles+l.size();
        }
        
        
     return cycles;   
        
        
        
        
    }
}