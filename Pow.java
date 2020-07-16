class Solution {
    double temp=0;
        double x1=0;
        
    public double myPow(double x, int n) {
        
        
        if(n<0)
            return 1.0/my(x,-n);
        return my(x,n);}
        
     private double my(double x,int n){
        if(x==0)
            return 0;
        if(n==1)
            return x;
        if(n==0)
            return 1;
        
       
        if(n%2==0)
        {
             return my(x*x,n/2);
         
            
        }
        else
        {
           return x*my(x*x,n/2);
        }
        
       
        
     }
}