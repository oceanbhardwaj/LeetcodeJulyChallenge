class Solution {
    public int addDigits(int num) {
        int g=0;
        int sum=num;
        int f=0;
        while(sum/10!=0)
        {
            g=sum;
            sum=0;
            while(g>0)
            {
            f=g%10;
                sum=sum+f;
                g=g/10;
            
            
            }
        }
        return sum;
        
    }
}