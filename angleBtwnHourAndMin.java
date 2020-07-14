class Solution {
    public double angleClock(int hour, int minutes) {
       // double d=hour+(double)((double)(minutes)/(double)60);
        double d22=(double)(minutes)/60;
        double d=d22+hour;
        double d1=d*30;
        //if(d1>=360)
           // d1=d1-360;
        double d2=minutes*6;
        
        double diff=Math.abs(d1-d2);
       double angle = Math.min(360-diff,diff); 
        return angle;
        
    }
}