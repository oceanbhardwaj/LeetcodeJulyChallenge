class Solution {
    public String reverseWords(String s) {
        
      s=s.replaceAll("\\s+"," ");
        
            String s1[]=s.split(" ");
        int l=0;
        int r=s1.length-1;
        while(l<r)
        {
            String temp=s1[l];
            s1[l]=s1[r];
            s1[r]=temp;
            l++;
            r--;
            
            
            
            
            
        }
       String d=" ";
        for(String word:s1)
            d=d+word+" ";
        
       d= d.trim();
        // d=d.replaceAll("//s+"," ");
        
        return d;
        
        
        
        
    }
}