class Solution {
    int n;
    public int maxProfit(int[] prices) {
       n=prices.length;
        return buy(prices,0);
    }
    
   HashMap<Integer,Integer> buymap=new HashMap<>();
     int buy(int prices[],int i)
    {
        if(i>=n)
            return 0;
        if(buymap.containsKey(i))
            return buymap.get(i);
        buymap.put(i,Math.max((-prices[i]+sell(prices,i+1)),buy(prices,i+1)));
       return buymap.get(i);            
    }
        HashMap<Integer,Integer> sellmap=new HashMap<>();
        int sell(int prices[],int i)
    {
        if(i>=n)
            return 0;
        if(sellmap.containsKey(i))
            return sellmap.get(i);
        sellmap.put(i,Math.max((prices[i]+buy(prices,i+2)),sell(prices,i+1)));
            return sellmap.get(i);
                   
    }
         
        
        