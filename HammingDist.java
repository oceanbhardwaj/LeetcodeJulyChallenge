class Solution {
    public int hammingDistance(int x, int y) {
        
        
        int count=0;
       /* for(int i=0;i<31;i++)
        {
if((x&(1<<i))!=(y &(1<<i)))
        count++;}
    return count;*/
        
        int d=x^y;
        while(d>0)
        { d=d&(d-1);
        count++;}
        return count;
        
    }
}

