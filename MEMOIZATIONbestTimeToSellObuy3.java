// class Solution {
//     //static int x=0;
//     public int maxProfit(int[] prices) {
//        // HashMap<String,Integer> h=new HashMap<>();
//          int t[][][]=new int[prices.length+1][2][3];
//         for(int i=0;i<=prices.length;i++)
//         { for(int j=0;j<2;j++)
//         {
//             for(int k=0;k<3;k++)
//             {
//                 t[i][j][k]=-1;
//             }
//         }
            
//         }
       
//         return call(0,prices,0,2,t);
//     }
//     static int call(int i,int prices[],int buyorsell,int count,int t[][][])
//     {
//         if(i>=prices.length || count==0|| prices.length<=1)
//             return 0;
//         // String s=i+"code"+buyorsell+"bix"+count;
//         // if(h.containsKey(s))
//         //     return h.get(s);
//         if(t[i][buyorsell][count]>0)
//             return t[i][buyorsell][count];
//         int x=0;
//         if(buyorsell==0)
//         {
//             int buy=call(i+1,prices,1,count,t)-prices[i];
//             int nobuy=call(i+1,prices,0,count,t);
//             x=Math.max(buy,nobuy);
//         }
//         else
//         {
//             int sell=call(i+1,prices,0,count-1,t)+prices[i];
//             int nosell=call(i+1,prices,1,count,t);
//             x=Math.max(sell,nosell);
//         }
//        // h.put(s,x);
//         return t[i][buyorsell][count]= x;
//     }
// }

class Solution {
//     //static int x=0;
     public int maxProfit(int[] prices) {
         int s1=-prices[0];
         int s2=0;
         int s3=Integer.MIN_VALUE;
         int s4=0;
         for(int i=1;i<prices.length;i++)
         {
             s1=Math.max(s1,-prices[i]);
             s2=Math.max(s2,s1+prices[i]);
             s3=Math.max(s3,s2-prices[i]);
             s4=Math.max(s4,s3+prices[i]);
             
             
             
         }
         
         return s4;
         
         
         
     }
}




        }
        else
        {
            int sell=call(i+1,prices,0,count-1,t)+prices[i];
            int nosell=call(i+1,prices,1,count,t);
            x=Math.max(sell,nosell);
        }
       // h.put(s,x);
        return t[i][buyorsell][count]= x;
    }
}





