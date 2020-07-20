class Solution {
    public String addBinary(String a, String b) {
        int n1=a.length()-1;
        int n2=b.length()-1;
       // if(n1>n2)
        
        int sum=0;
        int d=0;
        int carry=0;
        int d1=0;
        int d2=0;
        StringBuilder sb=new StringBuilder();
        
        while(n1>=0 || n2>=0)
        {
            if(n1<0)
                d1=0;
           else
             d1= Integer.parseInt(String.valueOf(a.charAt(n1)));
             
            if(n2<0)
                d2=0;
            else
              d2= Integer.parseInt(String.valueOf(b.charAt(n2)));
            
            sum=d1+d2+carry;
            
            
            
            if(sum>2)
            {
                sum=1;
                carry=1;
                
            }
            else if(sum==2)
            {
                sum=0;
                carry=1;
            
            }
            else if(sum<2)
            {
                carry=0;
            }
            sb.append(sum);
            n1--;
            n2--;
            if(n1<0 && n2<0)
                break;
    }
        if(carry==1)
        {
            sb.append(1);
        }
        sb.reverse();
        String str=sb.toString();
        return str;
        
        
    }
}