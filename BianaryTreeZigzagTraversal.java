/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       
    List<List<Integer>> a=new ArrayList<List<Integer>>();
        Stack<TreeNode> s=new Stack<TreeNode>();
         if(root==null)
            return a;
        boolean flag=false;
        s.push(root);
        while(!s.isEmpty())
        {
            ArrayList<Integer> res=new ArrayList<>();
            Stack<TreeNode> s1=new Stack<>();
            while(!s.isEmpty())
            {
                
            TreeNode t=s.peek();
            s.pop();
                res.add(t.val);
                if(flag)
                {
                   if(t.right!=null)
                       s1.push(t.right);
                    
                    if(t.left!=null)
                       s1.push(t.left);
                }
                else
                {
                    if(t.left!=null)
                       s1.push(t.left);
                    
                    if(t.right!=null)
                       s1.push(t.right);
                }
            }      
            
            a.add(res);
            Stack temp=s;
            s=s1;
            s1=temp;
            flag=!flag;}
                
                return a;
                    
                    
                    
                    
                }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        
        
        
        
        
        
        
        
        
        
        
    
}